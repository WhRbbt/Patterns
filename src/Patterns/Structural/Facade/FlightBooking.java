package Patterns.Structural.Facade;

public class FlightBooking {
    void bookFlight(String date, String from, String to) {
        System.out.println("Flight booked on " + date + " from " + from + " to " + to);
    }
}