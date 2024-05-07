package Patterns.Behavioral.State;

public class ActiveState extends TourState {

    public ActiveState(JourneyContext journey) {
        super(journey);
    }

    @Override
    public String onPlan() {
        return "Already started, plan next while active";
    }

    @Override
    public String onStart() {
        return "Already active";
    }

    @Override
    public String onNext() {
        journey.setCurrentDestination("Paris");
        return journey.nextDestination();
    }

    @Override
    public String onCancel() {
        journey.changeState(new CancelState(journey));
        return "Journey cancelled";
    }
}