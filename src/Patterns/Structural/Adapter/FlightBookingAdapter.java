package Patterns.Structural.Adapter;

public class FlightBookingAdapter implements Booking {
    private FlightBooking flightBooking;

    public FlightBookingAdapter(FlightBooking flightBooking) {
        this.flightBooking = flightBooking;
    }

    @Override
    public void book(String destination, String date) {
        flightBooking.reserveFlight(destination, date);
    }
}