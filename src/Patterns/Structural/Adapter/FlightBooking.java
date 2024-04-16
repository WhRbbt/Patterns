package Patterns.Structural.Adapter;

public class FlightBooking {
    public void reserveFlight(String destination, String date) {
        System.out.println("Flight reserved to " + destination + " on " + date);
    }
}