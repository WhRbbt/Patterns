package Patterns.Behavioral.Iterator;

public interface TourIterator {
    boolean hasNext();
    Tour next();
    boolean hasPrevious();
    Tour previous();
}