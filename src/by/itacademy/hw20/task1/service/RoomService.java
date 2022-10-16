package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exception.room.RoomExistException;
import by.itacademy.hw20.task1.exception.room.RoomNotExistException;
import by.itacademy.hw20.task1.model.hotel.Room;
import by.itacademy.hw20.task1.repository.RoomRepository;

import java.math.BigDecimal;
import java.util.List;

public class RoomService {

    private final RoomRepository repository = RoomRepository.getInstance();

    public void addRoom(int roomNumber) {

        if (repository.getRooms().contains(new Room(roomNumber))){
           throw new RoomExistException("ERROR! The room is already exist!");
        }
        Room room = new Room(roomNumber);
        repository.getRooms().add(room);

    }

    public void setPriceOfRoom(Room room, BigDecimal price) {
       room.setPrice(price);
    }

    public Room getRoom(int roomNumber) {
        List<Room> roomList = repository.getRooms().stream()
                .filter(room -> room.getNumber() == roomNumber)
                .limit(1)
                .toList();

        if (roomList.isEmpty()) {
            throw new RoomNotExistException("ERROR! The room not found!");
        }

        return roomList.get(0);
    }

    public List<Room> getRooms() {

        return repository.getRooms();
    }
}
