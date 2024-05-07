package Patterns.Behavioral.State;

public class PlanState extends TourState {

    public PlanState(JourneyContext journey) {
        super(journey);
    }

    @Override
    public String onPlan() {
        return "Planning...";
    }

    @Override
    public String onStart() {
        journey.changeState(new ActiveState(journey));
        journey.setCurrentDestination("Hawaii");
        return "Journey started";
    }

    @Override
    public String onNext() {
        return "Plan more before starting";
    }

    @Override
    public String onCancel() {
        return "Planning cancelled";
    }
}