package Patterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<String> bookings = new ArrayList<>();

    public void addBooking(String bookingDetail) {
        bookings.add(bookingDetail);
    }

    public List<String> getBookings() {
        return bookings;
    }

    public BookingSnapshot createSnapshot() {
        return new BookingSnapshot(new ArrayList<>(bookings));
    }

    public void restore(BookingSnapshot snapshot) {
        bookings = snapshot.getSavedBookings();
    }
}