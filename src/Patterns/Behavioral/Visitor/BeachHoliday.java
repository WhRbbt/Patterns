package Patterns.Behavioral.Visitor;

public class BeachHoliday implements TravelElement {
    private String beachName;
    public BeachHoliday(String beachName) {
        this.beachName = beachName;
    }
    public String getBeachName() {
        return beachName;
    }
    @Override
    public String accept(Planner planner) {
        return planner.visitBeach(this);
    }
}