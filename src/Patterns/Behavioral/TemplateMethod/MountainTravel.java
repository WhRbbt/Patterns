package Patterns.Behavioral.TemplateMethod;

public class MountainTravel extends TravelTemp {
    public MountainTravel(String customerName) {
        super(customerName);
    }

    boolean preBooking() {
        System.out.println("Checking mountain vacation availability...");
        return true;
    }

    void bookTransport() {
        System.out.println("Transport to mountain booked via train");
    }

    void bookAccommodation() {
        System.out.println("Mountain lodge accommodation booked");
    }

    void additionalServices() {
        System.out.println("Additional hiking gear and guided tours included");
    }
}