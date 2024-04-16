package Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage implements TravelComponent {
    private String packageName;
    private List<TravelComponent> components = new ArrayList<>();

    public TravelPackage(String packageName) {
        this.packageName = packageName;
    }

    public void add(TravelComponent component) {
        components.add(component);
    }

    public void remove(TravelComponent component) {
        components.remove(component);
    }

    public void displayServiceDetails() {
        System.out.println("Package: " + packageName);
        for (TravelComponent component : components) {
            component.displayServiceDetails();
        }
    }
}