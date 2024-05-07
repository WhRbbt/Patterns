package Patterns.Behavioral.Strategy;

public class RailTravel implements TravelStrategy {
    public void planRoute(String origin, String destination) {
        System.out.println("Planning a route from " + origin + " to " + destination);
    }

    public double calculateTime(String origin, String destination) {
        return DistanceCalculator.computeRailDistance(origin, destination) / 60.0;
    }

    public double calculateCost(String origin, String destination) {
        return DistanceCalculator.computeRailDistance(origin, destination) * 0.10;
    }
}