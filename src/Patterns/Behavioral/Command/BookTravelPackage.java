package Patterns.Behavioral.Command;

public class BookTravelPackage implements Command {
    private TravelPackage travelPackage;

    public BookTravelPackage(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }

    @Override
    public void execute() {
        travelPackage.book();
    }
}