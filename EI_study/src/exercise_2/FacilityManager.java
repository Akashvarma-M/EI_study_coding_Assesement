package exercise_2;

import java.time.LocalTime;
import java.util.*;

class FacilityManager {
    private static FacilityManager instance;
    private List<Room> rooms = new ArrayList<>();

    private FacilityManager() {}

    public static FacilityManager getInstance() {
        if (instance == null) {
            instance = new FacilityManager();
        }
        return instance;
    }

    public void configureRooms(int roomCount) {
        for (int i = 1; i <= roomCount; i++) {
            rooms.add(new Room(i));
        }
        System.out.println("Office configured with " + roomCount + " meeting rooms: " + getRoomNames(roomCount));
    }

    public void setRoomCapacity(int roomId, int capacity) {
        if (capacity > 0) {
            Room room = getRoom(roomId);
            if (room != null) {
                room.setCapacity(capacity);
                System.out.println("Room " + roomId + " maximum capacity set to " + capacity + ".");
            }
        } else {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        }
    }

    public void bookRoom(int roomId, String startTime, int durationMinutes) {
        Room room = getRoom(roomId);
        if (room != null) {
            room.book(startTime, durationMinutes);
        }
    }

    public void cancelBooking(int roomId) {
        Room room = getRoom(roomId);
        if (room != null) {
            room.cancelBooking();
        }
    }

    public void setOccupancy(int roomId, int occupants) {
        Room room = getRoom(roomId);
        if (room != null) {
            room.setOccupancy(occupants);
        }
    }

    public void checkRoomStatus(int roomId) {
        Room room = getRoom(roomId);
        if (room != null) {
            room.checkAndReleaseBooking();
            room.printCurrentStatus();
        }
    }

    private Room getRoom(int roomId) {
        if (roomId > 0 && roomId <= rooms.size()) {
            return rooms.get(roomId - 1);
        } else {
            System.out.println("Room " + roomId + " does not exist.");
            return null;
        }
    }

    private String getRoomNames(int roomCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= roomCount; i++) {
            sb.append("Room ").append(i);
            if (i < roomCount) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
