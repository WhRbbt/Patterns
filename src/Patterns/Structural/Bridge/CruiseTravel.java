package Patterns.Structural.Bridge;

public class CruiseTravel extends TravelType {
    public CruiseTravel(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }
}