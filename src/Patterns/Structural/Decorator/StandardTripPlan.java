package Patterns.Structural.Decorator;

public class StandardTripPlan implements TripPlan {
    public String getDescription() {
        return "Standard Trip Plan";
    }

    public double cost() {
        return 100.0;
    }
}
