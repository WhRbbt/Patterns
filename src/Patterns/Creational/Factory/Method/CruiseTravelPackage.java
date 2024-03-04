package Patterns.Creational.Factory.Method;

public class CruiseTravelPackage implements TravelPackageFactory {
    @Override
    public void displayDetails() {
        System.out.println("CruiseTravelPackage: Includes travel on a luxury cruise.");
    }
}