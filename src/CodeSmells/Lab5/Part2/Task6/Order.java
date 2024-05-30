package CodeSmells.Lab5.Part2.Task6;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private String productName;
    private int quantity;

    private List<GUI> observers = new ArrayList<>();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        notifyObservers();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        notifyObservers();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    public void registerObserver(GUI observer) {
        observers.add(observer);
    }

    public void removeObserver(GUI observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (GUI observer : observers) {
            observer.update();
        }
    }
}
