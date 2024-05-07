package Patterns.Behavioral.Visitor;

public interface TravelElement {
    String accept(Planner planner);
}