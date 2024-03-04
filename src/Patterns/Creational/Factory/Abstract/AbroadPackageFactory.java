package Patterns.Creational.Factory.Abstract;

public class AbroadPackageFactory implements AbstractPackageFactory {
    public Flight createFlight() {
        return new AbroadFlight();
    }

    public Hotel createHotel() {
        return new AbroadHotel();
    }
}