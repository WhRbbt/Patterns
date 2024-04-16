package Patterns.Structural.Proxy;

public class BookingServiceProxy implements BookingService {
    private BookingService bookingService;

    public BookingServiceProxy() {
        this.bookingService = new RealBookingService();
    }

    @Override
    public void bookFlight(String destination) {
        System.out.println("Proxy: Checking data...");
        bookingService.bookFlight(destination);
    }
}