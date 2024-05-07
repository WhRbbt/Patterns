package Patterns.Behavioral.Visitor;

public class CityVisit implements TravelElement {
    private String cityName;
    public CityVisit(String cityName) {
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }
    @Override
    public String accept(Planner planner) {
        return planner.visitCity(this);
    }
}