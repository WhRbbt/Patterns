package Patterns.Behavioral.TemplateMethod;

public abstract class TravelTemp {
    String customerName;
    String bookingID;

    TravelTemp(String customerName) {
        this.customerName = customerName;
    }

    public final void bookVacation() {
        generateBookingID();
        if (preBooking()) {
            bookTransport();
            bookAccommodation();
            additionalServices();
            confirmBooking();
        }
    }

    abstract boolean preBooking();
    abstract void bookTransport();
    abstract void bookAccommodation();
    abstract void additionalServices();

    void generateBookingID() {
        this.bookingID = "ID" + (int) (Math.random() * 10000);
        System.out.println("Booking ID Generated: " + this.bookingID);
    }

    void confirmBooking() {
        System.out.println("Vacation booked successfully for " + customerName);
    }
}
