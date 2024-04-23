package Patterns.Structural.Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingServiceProxy implements BookingService {
    public BookingService bookingService;
    public List<String> allowedDestinations = new ArrayList<>(Arrays.asList("Paris", "New York", "London"));

    public BookingServiceProxy() {
        this.bookingService = new RealBookingService();
    }

    @Override
    public void bookFlight(String destination) {
        System.out.println("Checking if destination is allowed...");
        if (allowedDestinations.contains(destination)) {
            System.out.println("Destination is allowed.");
            bookingService.bookFlight(destination);
        } else {
            System.out.println("Destination is not allowed. Booking canceled.");
        }
    }
}
