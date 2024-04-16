package Patterns.Structural.Decorator;

public class InsuranceDecorator extends TripPlanDecorator {
    public InsuranceDecorator(TripPlan tripPlan) {
        super(tripPlan);
    }

    public String getDescription() {
        return super.getDescription() + ", including travel insurance";
    }

    public double cost() {
        return super.cost() + 50.0;
    }
}