package Patterns.Behavioral.State;

public class CancelState extends TourState {

    public CancelState(JourneyContext journey) {
        super(journey);
    }

    @Override
    public String onPlan() {
        return "Cannot plan, journey cancelled";
    }

    @Override
    public String onStart() {
        return "Cannot start, journey cancelled";
    }

    @Override
    public String onNext() {
        return "No next, journey cancelled";
    }

    @Override
    public String onCancel() {
        return "Already cancelled";
    }
}