package Patterns.Behavioral.Strategy;

public class RoadTravel implements TravelStrategy {
    public void planRoute(String origin, String destination) {
        System.out.println("Planning a road route from " + origin + " to " + destination);
    }

    public double calculateTime(String origin, String destination) {
        return DistanceCalculator.computeRoadDistance(origin, destination) / 45.0;
    }

    public double calculateCost(String origin, String destination) {
        return DistanceCalculator.computeRoadDistance(origin, destination) * 0.12;
    }
}