package Patterns.Creational.Factory.Abstract;

public class FactoryCreator {
    public static AbstractPackageFactory getFactory(Type type) {
        switch (type) {
            case LOCAL:
                return new LocalTravelFactory();
            case ABROAD:
                return new AbroadPackageFactory();
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}