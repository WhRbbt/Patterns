package Patterns.Structural.Decorator;

public class FlightBookingDecorator extends TripPlanDecorator {
    public FlightBookingDecorator(TripPlan tripPlan) {
        super(tripPlan);
    }

    public String getDescription() {
        return super.getDescription() + ", including flight booking";
    }

    public double cost() {
        return super.cost() + 200.0;
    }
}
