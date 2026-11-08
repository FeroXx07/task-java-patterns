package observer;

public interface Dispatcher<T>{
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
    void dispatchEvent(T arg);
}