package observer.stock;

enum SubEventType {
    STOCK_UP,
    STOCK_DOWN,
}
public record StockEvent(String stockAgent, SubEventType subEventType, double oldValue, double newValue) { }
