package Patterns.Behavioral.Memento;

import java.util.List;

public class BookingSnapshot {
    private List<String> savedBookings;

    public BookingSnapshot(List<String> savedBookings) {
        this.savedBookings = savedBookings;
    }

    public List<String> getSavedBookings() {
        return savedBookings;
    }
}