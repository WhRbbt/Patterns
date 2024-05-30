package CodeSmells.Lab5.Part5.Task1;

public class Car extends Vehicle {
    private String model;

    public Car(String color, String model) {
        super(color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
