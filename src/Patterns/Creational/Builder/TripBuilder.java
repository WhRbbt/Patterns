package Patterns.Creational.Builder;

public interface TripBuilder {
    TripBuilder destination(String destination);
    TripBuilder duration(int durationDays);
    TripBuilder transportation(String transportation);
    TripBuilder accommodation(String accommodation);
    TripBuilder activity(String activity);
    Trip build();
}
