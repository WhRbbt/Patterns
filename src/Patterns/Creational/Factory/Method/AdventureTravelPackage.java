package Patterns.Creational.Factory.Method;

public class AdventureTravelPackage implements TravelPackageFactory {
    @Override
    public void displayDetails() {
        System.out.println("AdventureTravelPackage: Includes adventurous activities.");
    }
}
