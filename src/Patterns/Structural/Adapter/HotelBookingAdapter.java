package Patterns.Structural.Adapter;

public class HotelBookingAdapter implements Booking {
    private HotelBooking hotelBooking;

    public HotelBookingAdapter(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    @Override
    public void book(String hotelName, String nights) {
        hotelBooking.bookHotel(hotelName, Integer.parseInt(nights));
    }
}