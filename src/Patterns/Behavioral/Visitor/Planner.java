package Patterns.Behavioral.Visitor;

public interface Planner {
    String visitCity(CityVisit city);
    String visitSafari(SafariAdventure safari);
    String visitBeach(BeachHoliday beach);
}