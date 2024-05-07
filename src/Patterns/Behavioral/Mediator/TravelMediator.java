package Patterns.Behavioral.Mediator;

public class TravelMediator implements Mediator {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public TravelMediator() {
        flightBooking = new FlightBooking(this);
        hotelBooking = new HotelBooking(this);
        carRental = new CarRental(this);
    }

    public void book(String service) {
        switch (service) {
            case "flight":
                flightBooking.bookFlight();
                break;
            case "hotel":
                hotelBooking.bookHotel();
                break;
            case "car":
                carRental.rentCar();
                break;
        }
    }
}