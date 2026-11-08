package observer.stock;

import observer.Observer;

import java.io.PrintStream;
import java.util.Optional;

public class StockBrokerAgency implements Observer<StockEvent> {
    private final String name;
    public StockBrokerAgency(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(StockEvent arg) {
        System.out.println(name + " received notification: Stock market went " + arg.subEventType().toString() + " to " + arg.newValue());
    }
}
