package Patterns.Behavioral.Strategy;

public class TravelByPlane implements TravelStrategy {
    public void planRoute(String origin, String destination) {
        System.out.println("Planning an air route from " + origin + " to " + destination);
    }

    public double calculateTime(String origin, String destination) {
        return DistanceCalculator.computeAirDistance(origin, destination) / 500.0;
    }

    public double calculateCost(String origin, String destination) {
        return DistanceCalculator.computeAirDistance(origin, destination) * 0.15;
    }
}
