package Patterns.Creational.Singleton;

import java.util.ArrayList;

public class TravelAgency {
    private static TravelAgency instance;

    private ArrayList<String> availableDestinations;

    public TravelAgency() {
        availableDestinations = new ArrayList<>();

        availableDestinations.add("London");
        availableDestinations.add("New York");
        availableDestinations.add("Paris");
        availableDestinations.add("Tokyo");
    }

    public static TravelAgency getInstance() {
        if (instance == null) {
            instance = new TravelAgency();
        }
        return instance;
    }
    public void bookTrip(String destination) {
        if (availableDestinations.contains(destination)) {
            System.out.println("Trip to " + destination + " booked successfully!");
        } else {
            System.out.println("Destination not available.");
        }
    }

    public void addDestination(String destination) {
        if (!availableDestinations.contains(destination)) {
            availableDestinations.add(destination);
            System.out.println(destination + " added to available destinations.");
        }
    }

    public void listDestinations() {
        System.out.println("Available Destinations:");
        for (String destination : availableDestinations) {
            System.out.println("- " + destination);
        }
    }
}