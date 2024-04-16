package Patterns.Structural.Facade;

public class TravelPackageFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public TravelPackageFacade() {
        flightBooking = new FlightBooking();
        hotelBooking = new HotelBooking();
        carRental = new CarRental();
    }

    public void bookTravelPackage(String from, String to, String date, String hotelName, String checkIn, String checkOut, String startDate, String endDate) {
        flightBooking.bookFlight(date, from, to);
        hotelBooking.bookRoom(hotelName, checkIn, checkOut);
        carRental.rentCar(startDate, endDate);
        System.out.println("Travel package booked: Flight, Hotel, and Car Rental");
    }
}
