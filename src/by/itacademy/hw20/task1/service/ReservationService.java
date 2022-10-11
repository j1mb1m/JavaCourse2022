package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exception.IncorrectDateException;
import by.itacademy.hw20.task1.exception.RoomAvailabilityException;
import by.itacademy.hw20.task1.exception.RoomNotExistException;
import by.itacademy.hw20.task1.model.hotel.Order;
import by.itacademy.hw20.task1.model.hotel.Room;
import by.itacademy.hw20.task1.model.hotel.RoomReservationRecord;
import by.itacademy.hw20.task1.model.hotel.RoomStatus;
import by.itacademy.hw20.task1.model.users.User;
import by.itacademy.hw20.task1.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

public class ReservationService {

    private final ReservationRepository repository = ReservationRepository.getInstance();
    private final OrderService orderService = new OrderService();
    private final RoomService roomService = new RoomService();

    public List<Room> getFreeRooms(LocalDate startBooking, LocalDate endBooking) {

        List<Room> occupiedRooms = repository.getRoomReservationLog().stream()
                .filter(record ->
                        (record.getStartBooking().isAfter(startBooking) || record.getStartBooking().equals(startBooking))
                                && (record.getEndBooking().isBefore(endBooking) || record.getEndBooking().equals(endBooking)))
                .map(RoomReservationRecord::getRoom)
                .toList();

        return roomService.getRooms().stream().filter(room -> !occupiedRooms.contains(room)).toList();
    }

    public boolean isFreeRoom(Room room, LocalDate startBooking, LocalDate endBooking) {

        List<Room> freeRooms = getFreeRooms(startBooking, endBooking);

        return freeRooms.contains(room) && roomService.getRooms().contains(room);
    }

    public Order checkInRoom(User user, int roomNumber, LocalDate startDate, LocalDate endDate) {

        Room room = roomService.getRoom(roomNumber);

        if (isFreeRoom(room, startDate, endDate)) {
            RoomReservationRecord record = new RoomReservationRecord(user, room, startDate, endDate);
            Order order = orderService.createOrder(user, record);
            repository.getRoomReservationLog().add(record);

            return order;

        } else {
            throw new RoomAvailabilityException("ERROR! The room is not available!");
        }
    }

    public void checkOutRoom(User user, int roomNumber, LocalDate startDate, LocalDate endDate) {

        Room room = roomService.getRoom(roomNumber);

        List<RoomReservationRecord> records = repository.getRoomReservationLog().stream()
                .filter(record -> record.getUser().equals(user)
                        && record.getRoom().equals(room)
                        && record.getStartBooking().equals(startDate))
                .limit(1)
                .toList();

        if (records.isEmpty()){
            throw new RoomNotExistException("ERROR! The booking is not found!");
        }

        RoomReservationRecord record = records.get(0);

        if (record.getEndBooking().isBefore(endDate)){
            throw new IncorrectDateException("ERROR! The check-out date cannot be longer than the booking date!");
        }

        record.setEndBooking(endDate);
    }

    public RoomReservationRecord doRoomRenovation(int roomNumber, LocalDate startDate, LocalDate endDate) {

        Room room = roomService.getRoom(roomNumber);

        if (isFreeRoom(room, startDate, endDate)) {
            RoomReservationRecord record = new RoomReservationRecord(new User(), room, startDate, endDate);
            record.setStatus(RoomStatus.REPAIRED);
            repository.getRoomReservationLog().add(record);

            return record;

        } else {
            throw new RoomAvailabilityException("ERROR! The room is not available!");
        }
    }

    public List<RoomReservationRecord> getRoomReservationRecords(){
        return repository.getRoomReservationLog();
    }

}
