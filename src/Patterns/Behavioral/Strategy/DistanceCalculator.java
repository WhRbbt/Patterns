package Patterns.Behavioral.Strategy;

public class DistanceCalculator {

    public static double computeAirDistance(String origin, String destination) {
        if (origin.equals("New York") && destination.equals("London")) {
            return 3450;
        } else if (origin.equals("Paris") && destination.equals("Berlin")) {
            return 600;
        } else if (origin.equals("San Francisco") && destination.equals("Los Angeles")) {
            return 380;
        }
        return 0;
    }

    public static double computeRailDistance(String origin, String destination) {
        if (origin.equals("New York") && destination.equals("Chicago")) {
            return 790;
        } else if (origin.equals("Paris") && destination.equals("Berlin")) {
            return 650;
        } else if (origin.equals("San Francisco") && destination.equals("Los Angeles")) {
            return 400;
        }
        return 0;
    }

    public static double computeRoadDistance(String origin, String destination) {
        if (origin.equals("New York") && destination.equals("Washington DC")) {
            return 225;
        } else if (origin.equals("Paris") && destination.equals("Berlin")) {
            return 685;
        } else if (origin.equals("San Francisco") && destination.equals("Los Angeles")) {
            return 420;
        }
        return 0;
    }
}