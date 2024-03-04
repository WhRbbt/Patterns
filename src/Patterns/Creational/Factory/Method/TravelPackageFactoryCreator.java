package Patterns.Creational.Factory.Method;

public class TravelPackageFactoryCreator {
    public static TravelPackageFactory createFactory(Patterns.Creational.Factory.Method.TravelPackageType type) {
        switch (type) {
            case INTERNATIONAL:
                return new InternationalTravelPackage();
            case CRUISE:
                return new CruiseTravelPackage();
            case ADVENTURE:
                return new AdventureTravelPackage();
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}