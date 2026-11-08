package observer;

public interface Observer<T> {
    void handleEvent(T arg);
}