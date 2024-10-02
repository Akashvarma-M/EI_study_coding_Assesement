package exercise_2;

import java.time.LocalTime;
import java.util.*;

public class SmartOfficeApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FacilityManager facilityManager = FacilityManager.getInstance();

        while (true) {
            System.out.println("Enter a command:");
            String input = scanner.nextLine();
            processInput(input, facilityManager);
        }
    }

    private static void processInput(String input, FacilityManager facilityManager) {
        String[] tokens = input.split(" ");
        String command = tokens[0];

        switch (command) {
            case "Config":
                if (tokens[1].equals("room") && tokens[2].equals("count")) {
                    int roomCount = Integer.parseInt(tokens[3]);
                    facilityManager.configureRooms(roomCount);
                } else if (tokens[1].equals("room") && tokens[2].equals("max") && tokens[3].equals("capacity")) {
                    int roomId = Integer.parseInt(tokens[4]);
                    int capacity = Integer.parseInt(tokens[5]);
                    facilityManager.setRoomCapacity(roomId, capacity);
                }
                break;

            case "Block":
                int roomId = Integer.parseInt(tokens[2]);
                String startTime = tokens[3];
                int duration = Integer.parseInt(tokens[4]);
                facilityManager.bookRoom(roomId, startTime, duration);
                break;

            case "Cancel":
                roomId = Integer.parseInt(tokens[2]);
                facilityManager.cancelBooking(roomId);
                break;

            case "Add":
                if (tokens[1].equals("occupant")) {
                    roomId = Integer.parseInt(tokens[2]);
                    int occupantCount = Integer.parseInt(tokens[3]);
                    facilityManager.setOccupancy(roomId, occupantCount);
                }
                break;

            case "Room":
                if (tokens[1].equals("status")) {
                    roomId = Integer.parseInt(tokens[2]);
                    facilityManager.checkRoomStatus(roomId);
                }
                break;

            default:
                System.out.println("Invalid command.");
        }
    }
}
