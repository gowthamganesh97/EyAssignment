package com.ey.day8.Q2;
class ConferenceRoom {
    private boolean isAvailable = true;

    public synchronized boolean bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public synchronized void releaseRoom() {
        isAvailable = true;
    }
}

class ConferenceRoomBookingJob {
    private ConferenceRoom room;

    public ConferenceRoomBookingJob(ConferenceRoom room) {
        this.room = room;
    }

    public void performBooking(String managerName) {
        synchronized (room) {
            if (room.bookRoom()) {
                System.out.println(managerName + " booked the conference room.");
                conductMeeting(managerName);
                room.releaseRoom();
                System.out.println(managerName + " released the conference room.");
            } else {
                System.out.println(managerName + " couldn't book the conference room. It's already booked.");
            }
        }
    }

    private void conductMeeting(String managerName) {
        System.out.println(managerName + " is conducting the meeting.");
        try {
            Thread.sleep(5000); // Simulating meeting time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Manager extends Thread {
    private ConferenceRoomBookingJob bookingJob;

    public Manager(ConferenceRoomBookingJob bookingJob, String name) {
        super(name);
        this.bookingJob = bookingJob;
    }

    @Override
    public void run() {
        bookingJob.performBooking(getName());
    }
}

public class ConferenceRoombooking {
    public static void main(String[] args) {
        ConferenceRoom room = new ConferenceRoom();
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob(room);

        Manager manager1 = new Manager(bookingJob, "Manager 1");
        Manager manager2 = new Manager(bookingJob, "Manager 2");

        manager1.start();
        manager2.start();
    }
}