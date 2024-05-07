package Patterns.Behavioral.Strategy;

public class TravelPlanner {
    private TravelStrategy travelStrategy;

    public TravelPlanner(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void planTrip(String origin, String destination) {
        travelStrategy.planRoute(origin, destination);
        System.out.println("Estimated travel time: " + travelStrategy.calculateTime(origin, destination) + " hours");
        System.out.println("Estimated cost: $" + travelStrategy.calculateCost(origin, destination));
    }
}
