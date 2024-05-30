package CodeSmells.Lab5.Part5.Task5;

class Car extends Vehicle {
    protected String model;

    public Car(int yearOfManufacture, String model) {
        super(yearOfManufacture);
        this.model = model;
    }
}