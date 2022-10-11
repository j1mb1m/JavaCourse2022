package by.itacademy.hw20.task1.repository;

import by.itacademy.hw20.task1.model.hotel.Room;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository {

    private final List<Room> rooms = new ArrayList<>();

    private static RoomRepository instance;

    public static RoomRepository getInstance() {
        if (instance == null) {
            instance = new RoomRepository();
        }
        return instance;
    }

    private RoomRepository() {
        init();
    }

    private void init() {
        rooms.add(new Room(100, new BigDecimal(65)));
        rooms.add(new Room(101, new BigDecimal(65)));
        rooms.add(new Room(102, new BigDecimal(70)));
        rooms.add(new Room(200, new BigDecimal(85)));
    }

    public List<Room> getRooms() {
        return rooms;
    }

}
