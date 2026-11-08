package observer.stock;

import observer.EventManager;

public class StockAgent {
    private final String name;
    public EventManager<StockEvent> stocksEventManager;
    private double value;

    public StockAgent(String name, double value) {
        stocksEventManager = new EventManager<StockEvent>();
        this.name = name;
        this.value = value;
    }

    public void stockMarketChange(double newValue) {
        if (this.value == newValue) {
            return;
        }

        SubEventType type = newValue > this.value ? SubEventType.STOCK_UP : SubEventType.STOCK_DOWN;
        StockEvent event = new StockEvent(name, type, this.value, newValue);
        this.value = newValue;
        stocksEventManager.dispatchEvent(event);
    }
}
