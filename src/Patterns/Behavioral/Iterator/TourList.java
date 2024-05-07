package Patterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TourList implements TourCollection {
    private List<Tour> tours = new ArrayList<>();

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public TourIterator iterator() {
        return new TourListIterator(this);
    }

    public int size() {
        return tours.size();
    }

    public Tour get(int index) {
        return tours.get(index);
    }
}