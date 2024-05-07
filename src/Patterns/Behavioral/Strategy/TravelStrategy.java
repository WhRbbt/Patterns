package Patterns.Behavioral.Strategy;

public interface TravelStrategy {
    void planRoute(String origin, String destination);
    double calculateTime(String origin, String destination);
    double calculateCost(String origin, String destination);
}