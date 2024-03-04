package Patterns.Creational.Prototype;

public class Apartment implements ApartmentPrototype {
    private String location;
    private int numberOfRooms;
    private double price;

    public Apartment(String location, int numberOfRooms, double price) {
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    @Override
    public Apartment clone() {
        return new Apartment(this.location, this.numberOfRooms, this.price);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment:" +
                "location — " + location +
                ", numberOfRooms — " + numberOfRooms +
                ", price — " + price;
    }
}