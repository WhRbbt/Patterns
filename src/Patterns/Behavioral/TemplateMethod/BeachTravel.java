package Patterns.Behavioral.TemplateMethod;

public class BeachTravel extends TravelTemp {
    public BeachTravel(String customerName) {
        super(customerName);
    }

    boolean preBooking() {
        System.out.println("Checking beach vacation availability...");
        return true;
    }

    void bookTransport() {
        System.out.println("Transport to beach booked via flight");
    }

    void bookAccommodation() {
        System.out.println("Beach resort accommodation booked");
    }

    void additionalServices() {
        System.out.println("Additional water sports and meals included");
    }
}
