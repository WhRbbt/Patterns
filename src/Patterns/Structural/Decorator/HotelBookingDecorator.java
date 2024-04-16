package Patterns.Structural.Decorator;

public class HotelBookingDecorator extends TripPlanDecorator {
    public HotelBookingDecorator(TripPlan tripPlan) {
        super(tripPlan);
    }

    public String getDescription() {
        return super.getDescription() + ", including hotel booking";
    }

    public double cost() {
        return super.cost() + 300.0;
    }
}
