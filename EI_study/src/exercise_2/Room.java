package exercise_2;

import java.time.LocalTime;
import java.util.*;

class Room {
    private int roomId;
    private int capacity;
    private boolean isOccupied;
    private boolean isBooked;
    private String bookingTime;
    private int bookingDuration;
    private Timer timer;
    
    public Room(int roomId) {
        this.roomId = roomId;
        this.capacity = 0;
        this.isOccupied = false;
        this.isBooked = false;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void book(String startTime, int durationMinutes) {
        if (isBooked) {
            System.out.println("Room " + roomId + " is already booked during this time. Cannot book.");
        } else {
            this.isBooked = true;
            this.bookingTime = startTime;
            this.bookingDuration = durationMinutes;
            System.out.println("Room " + roomId + " booked from " + startTime + " for " + durationMinutes + " minutes.");
            startAutoReleaseTimer();
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            cancelAutoReleaseTimer();
            System.out.println("Booking for Room " + roomId + " cancelled successfully.");
        } else {
            System.out.println("Room " + roomId + " is not booked. Cannot cancel booking.");
        }
    }

    public void setOccupancy(int occupants) {
        if (occupants >= 2) {
            isOccupied = true;
            cancelAutoReleaseTimer();
            System.out.println("Room " + roomId + " is now occupied by " + occupants + " persons. AC and lights turned on.");
        } else if (occupants == 0 && isOccupied) {
            isOccupied = false;
            System.out.println("Room " + roomId + " is now unoccupied. AC and lights turned off.");
            startAutoReleaseTimer();
        } else {
            System.out.println("Room " + roomId + " occupancy insufficient to mark as occupied.");
        }
    }

    public void checkAndReleaseBooking() {
        if (isBooked && !isOccupied) {
            System.out.println("Room " + roomId + " is now unoccupied. Booking released. AC and lights off.");
            isBooked = false;
        }
    }
    
    public void printCurrentStatus() {
        System.out.println("Room " + roomId + " [Booked: " + isBooked + ", Occupied: " + isOccupied + ", Capacity: " + capacity + "]");
    }

    private void startAutoReleaseTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!isOccupied && isBooked) {
                    checkAndReleaseBooking();
                }
            }
        }, 5 * 60 * 1000);  // 5 minutes
    }

    private void cancelAutoReleaseTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}
