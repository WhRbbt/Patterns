package Patterns.Behavioral.Iterator;

public class TourListIterator implements TourIterator {
    private TourList tourList;
    private int currentIndex = 0;

    public TourListIterator(TourList tourList) {
        this.tourList = tourList;
    }

    public boolean hasNext() {
        return currentIndex < tourList.size();
    }

    public Tour next() {
        return tourList.get(currentIndex++);
    }

    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    public Tour previous() {
        return tourList.get(--currentIndex);
    }
}