package by.itacademy.hw20.task1.repository;

import by.itacademy.hw20.task1.model.hotel.RoomReservationRecord;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {

    private final List<RoomReservationRecord> roomReservationLog = new ArrayList<>();

    private static ReservationRepository instance;

    public static ReservationRepository getInstance() {
        if (instance == null) {
            instance = new ReservationRepository();
        }
        return instance;
    }

    private ReservationRepository() {
        init();
    }

    private void init() {

    }

    public List<RoomReservationRecord> getRoomReservationLog() {
        return roomReservationLog;
    }

}
