package Patterns.Creational.Builder;

public class Trip {
    private String destination;
    private int durationDays;
    private String transportation;
    private String accommodation;
    private String activity;

    public Trip(String destination, int durationDays, String transportation, String accommodation, String activity) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.transportation = transportation;
        this.accommodation = accommodation;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Trip: " +
                " Destination — " + destination +
                ", Duration — " + durationDays +
                ", Transportation — " + transportation +
                ", Accommodation — " + accommodation +
                ", Activity — " + activity;
    }
}
