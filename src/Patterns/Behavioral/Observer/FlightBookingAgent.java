package Patterns.Behavioral.Observer;

public class FlightBookingAgent implements TravelObserver {
    private String agentName;

    public FlightBookingAgent(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Flight Booking Agent " + agentName + " received notification: " + eventType + " - " + message);
    }
}
