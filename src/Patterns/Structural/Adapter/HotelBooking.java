package Patterns.Structural.Adapter;

public class HotelBooking {
    public void bookHotel(String hotelName, int nights) {
        System.out.println("Hotel room booked at " + hotelName + " for " + nights + " nights");
    }
}