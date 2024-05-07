package Patterns.Structural.Proxy;

public class RealBookingService implements BookingService {
    @Override
    public void bookFlight(String destination)  {
        System.out.println("Booking flight to " + destination);
    }
}