package CodeSmells.Lab5.Part5.Task1;

public class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}