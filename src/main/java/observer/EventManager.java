package observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager<T> implements Dispatcher<T> {
    List<Observer<T>> observers;

    public EventManager() {
        observers = new ArrayList<>();
    }

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void dispatchEvent(T arg) {
        observers.forEach(obs -> obs.handleEvent(arg));
    }
}
