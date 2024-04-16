package Patterns.Structural.Facade;

public class HotelBooking {
    void bookRoom(String hotelName, String checkIn, String checkOut) {
        System.out.println("Hotel room booked at " + hotelName + " from " + checkIn + " to " + checkOut);
    }
}