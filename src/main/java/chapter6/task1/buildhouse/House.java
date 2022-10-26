package chapter6.task1.buildhouse;

import chapter6.task1.Room;

import java.util.List;

public class House {

    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Rooms" + rooms;
    }
}
