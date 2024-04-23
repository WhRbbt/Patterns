package Patterns.Structural.Adapter;

public class HotelBooking {
    public void bookHotel(String hotelName, int days) {
        System.out.println("Hotel room booked at " + hotelName + " for " + days + " days");
    }
}