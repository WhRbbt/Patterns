package Patterns.Creational.Factory.Abstract;

public class LocalTravelFactory implements AbstractPackageFactory {
    public Flight createFlight() {
        return new LocalFlight();
    }

    public Hotel createHotel() {
        return new LocalHotel();
    }
}