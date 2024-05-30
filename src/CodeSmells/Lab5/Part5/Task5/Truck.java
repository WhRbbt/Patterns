package CodeSmells.Lab5.Part5.Task5;

class Truck extends Vehicle {
    protected String model;

    public Truck(int yearOfManufacture, String model) {
        super(yearOfManufacture);
        this.model = model;
    }
}