package Patterns.Behavioral.Observer;

public class HotelBookingAgent implements TravelObserver {
    private String agentName;

    public HotelBookingAgent(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Hotel Booking Agent " + agentName + " received notification: " + eventType + " - " + message);
    }
}