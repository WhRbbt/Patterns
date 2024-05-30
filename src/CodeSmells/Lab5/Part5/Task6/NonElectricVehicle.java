package CodeSmells.Lab5.Part5.Task6;

public class NonElectricVehicle extends Vehicle {
    private int fuelCapacity;

    public NonElectricVehicle(String model, int fuelCapacity) {
        super(model);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}