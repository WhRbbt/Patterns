package Patterns.Behavioral.Visitor;

public class RoutePlanner implements Planner {
    public String visitCity(CityVisit city) {
        return "Plan city tour to " + city.getCityName();
    }
    public String visitSafari(SafariAdventure safari) {
        return "Plan safari in " + safari.getParkName();
    }
    public String visitBeach(BeachHoliday beach) {
        return "Plan beach holiday at " + beach.getBeachName();
    }
}