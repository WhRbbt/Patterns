package Patterns.Structural.Adapter;

public class BookingAdapter implements Booking {
    public FlightBooking flightBooking;
    public HotelBooking hotelBooking;

    public BookingAdapter(FlightBooking flightBooking, HotelBooking hotelBooking) {
        this.flightBooking = flightBooking;
        this.hotelBooking = hotelBooking;
    }

    @Override
    public void book(String name, String dateOrDays) {
        if (dateOrDays.contains("-")) {
            flightBooking.reserveFlight(name, dateOrDays);
        } else {
            int days = Integer.parseInt(dateOrDays);
            hotelBooking.bookHotel(name, days);
        }
    }
}