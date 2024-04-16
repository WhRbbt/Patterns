package Patterns.Structural.Decorator;

public abstract class TripPlanDecorator implements TripPlan {
    private TripPlan tripPlan;

    public TripPlanDecorator(TripPlan tripPlan) {
        this.tripPlan = tripPlan;
    }

    public String getDescription() {
        return tripPlan.getDescription();
    }

    public double cost() {
        return tripPlan.cost();
    }
}
