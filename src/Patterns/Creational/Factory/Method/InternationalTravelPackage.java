package Patterns.Creational.Factory.Method;

public class InternationalTravelPackage implements TravelPackageFactory {
    @Override
    public void displayDetails() {
        System.out.println("InternationalTravelPackage: Includes travel outside the country.");
    }
}