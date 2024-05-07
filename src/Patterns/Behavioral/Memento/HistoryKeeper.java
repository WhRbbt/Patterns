package Patterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class HistoryKeeper {
    private List<BookingSnapshot> snapshots = new ArrayList<>();
    private Booking booking;

    public HistoryKeeper(Booking booking) {
        this.booking = booking;
    }

    public void backup() {
        snapshots.add(booking.createSnapshot());
    }

    public void undo() {
        if (!snapshots.isEmpty()) {
            booking.restore(snapshots.removeLast());
        }
    }
}