package Patterns.Behavioral.Visitor;

public class SafariAdventure implements TravelElement {
    private String parkName;
    public SafariAdventure(String parkName) {
        this.parkName = parkName;
    }
    public String getParkName() {
        return parkName;
    }
    @Override
    public String accept(Planner planner) {
        return planner.visitSafari(this);
    }
}