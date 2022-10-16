package by.itacademy.hw20.task1.model.hotel;


import by.itacademy.hw20.task1.model.users.User;

import java.time.LocalDate;

public class RoomReservationRecord extends BaseModel{

    private static long counter = 1;
    private User user;
    private Room room;
    private LocalDate startBooking;
    private LocalDate endBooking;
    private RoomStatus status;

    public RoomReservationRecord(User user, Room room, LocalDate startBooking, LocalDate endBooking) {
        super(counter);
        this.user = user;
        this.room = room;
        this.startBooking = startBooking;
        this.endBooking = endBooking;
        this.status = RoomStatus.SERVICED;
        counter++;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getStartBooking() {
        return startBooking;
    }

    public LocalDate getEndBooking() {
        return endBooking;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setEndBooking(LocalDate endBooking) {
        this.endBooking = endBooking;
    }

    @Override
    public String toString() {
        return String.format("Booking %s - %s: user '%s' room №%s status %s",
                startBooking, endBooking, user.getLogin(), room, status);
    }
}
