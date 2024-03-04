package Patterns.Creational.Builder;

public class AdventureTripBuilder implements TripBuilder {
    private String destination;
    private int duration;
    private String transportation;
    private String accommodation;
    private String activity;

    @Override
    public TripBuilder destination(String destination) {
        this.destination=destination;
        return this;
    }

    @Override
    public TripBuilder duration(int duration) {
        this.duration=duration;
        return this;
    }

    @Override
    public TripBuilder transportation(String transportation) {
        this.transportation=transportation;
        return this;
    }

    @Override
    public TripBuilder accommodation(String accommodation) {
        this.accommodation=accommodation;
        return this;
    }

    @Override
    public TripBuilder activity(String activity) {
        this.activity=activity;
        return this;
    }

    @Override
    public Trip build() {
        return new Trip(destination, duration, transportation, accommodation, activity);
    }
}
