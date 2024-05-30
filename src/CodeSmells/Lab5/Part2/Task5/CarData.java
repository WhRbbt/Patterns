package CodeSmells.Lab5.Part2.Task5;

import java.util.ArrayList;
import java.util.List;

public class CarData {
    private List<Car> cars;

    public CarData(String[] carNames, int[] carPrices, int[] carYears) {
        cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i], carPrices[i], carYears[i]));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(int index) {
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void addCar(String name, int price, int year) {
        cars.add(new Car(name, price, year));
    }

    public String getCarName(int index) {
        return getCar(index).getName();
    }

    public int getCarPrice(int index) {
        return getCar(index).getPrice();
    }

    public int getCarYear(int index) {
        return getCar(index).getYear();
    }
}
