package Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelEventManager {
    private Map<String, List<TravelObserver>> observers = new HashMap<>();

    public TravelEventManager(String... operations) {
        for (String operation : operations) {
            this.observers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, TravelObserver observer) {
        List<TravelObserver> observersList = observers.get(eventType);
        if (observersList != null) {
            observersList.add(observer);
        }
    }

    public void unsubscribe(String eventType, TravelObserver observer) {
        List<TravelObserver> observersList = observers.get(eventType);
        if (observersList != null) {
            observersList.remove(observer);
        }
    }

    public void notify(String eventType, String message) {
        List<TravelObserver> observersList = observers.get(eventType);
        if (observersList != null) {
            for (TravelObserver observer : observersList) {
                observer.update(eventType, message);
            }
        }
    }
}
