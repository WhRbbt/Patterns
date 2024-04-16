package Patterns.Structural.Flyweight;


import java.util.HashMap;
import java.util.Map;

public class DestinationFactory {
    private static Map<String, DestinationFlyweight> destinations = new HashMap<>();

    public static DestinationFlyweight getDestination(String name, String description, String location) {
        DestinationFlyweight destination = destinations.get(name);
        if (destination == null) {
            destination = new Destination(name, description, location);
            destinations.put(name, destination);
        }
        return destination;
    }
}
