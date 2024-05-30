package CodeSmells.Lab5.Part4.Task12;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    private Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public static Car createCar(String brand, String model, int year, String color) {
        Car car = new Car(brand, model, year, color);
        car.registerCar();
        return car;
    }

    private void registerCar() {
        System.out.println("Car registered successfully!");
    }
}
