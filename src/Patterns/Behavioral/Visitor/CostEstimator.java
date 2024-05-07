package Patterns.Behavioral.Visitor;

public class CostEstimator implements Planner {
    public String visitCity(CityVisit city) {
        return "Estimate costs for city visit to " + city.getCityName();
    }
    public String visitSafari(SafariAdventure safari) {
        return "Estimate costs for safari in " + safari.getParkName();
    }
    public String visitBeach(BeachHoliday beach) {
        return "Estimate costs for beach holiday at " + beach.getBeachName();
    }
}
