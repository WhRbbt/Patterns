package Patterns.Creational.Builder;

public class Director {
    public Trip buildAdventureTrip(TripBuilder builder) {
        return builder.destination("Himalayas")
                .duration(14)
                .transportation("Flight and Hiking")
                .accommodation("Camping")
                .activity("Exploring Mountains")
                .build();
    }

    public Trip buildBeachTrip(TripBuilder builder) {
        return builder.destination("Maldives")
                .duration(7)
                .transportation("Flight")
                .accommodation("Beach Resort")
                .activity("Relaxation and Water Sports")
                .build();
    }
}
