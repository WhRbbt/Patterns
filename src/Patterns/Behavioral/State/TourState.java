package Patterns.Behavioral.State;

public abstract class TourState {
    JourneyContext journey;

    TourState(JourneyContext journey) {
        this.journey = journey;
    }

    public abstract String onPlan();
    public abstract String onStart();
    public abstract String onNext();
    public abstract String onCancel();
}