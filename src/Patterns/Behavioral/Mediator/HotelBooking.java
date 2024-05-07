package Patterns.Behavioral.Mediator;

public class HotelBooking {
    private Mediator mediator;

    public HotelBooking(Mediator mediator) {
        this.mediator = mediator;
    }

    public void bookHotel() {
        System.out.println("Hotel room booked successfully");
    }
}