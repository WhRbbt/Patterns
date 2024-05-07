package Patterns.Behavioral.State;

public class JourneyContext {
    private TourState state;
    private boolean active = false;
    private String currentDestination = "Not set";

    public JourneyContext() {
        this.state = new PlanState(this);
        setActive(true);
    }

    public void changeState(TourState state) {
        this.state = state;
    }

    public TourState getState() {
        return state;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public String nextDestination() {
        return "Travelling to " + currentDestination;
    }

    public void setCurrentDestination(String destination) {
        this.currentDestination = destination;
    }
}