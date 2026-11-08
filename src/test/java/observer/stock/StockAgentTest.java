package observer.stock;

import observer.Observer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StockAgentTest {
    @Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent("TSLA", 120.75);

        Observer<StockEvent> alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer<StockEvent> zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.stocksEventManager.subscribe(alphaBrokers);
        agent.stocksEventManager.subscribe(zenithInvestments);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(output));

            agent.stockMarketChange(150.75);
            // Expected console output:
            // Alpha Brokers received notification: Stock market went UP to 150.75
            // Zenith Investments received notification: Stock market went UP to 150.75

            // Verify output
            assertThat(output.toString())
                    .isEqualTo("Alpha Brokers received notification: Stock market went STOCK_UP to 150.75" + System.lineSeparator() +
                            "Zenith Investments received notification: Stock market went STOCK_UP to 150.75" + System.lineSeparator());

            agent.stockMarketChange(145.50);

            assertThat(output.toString())
                    .isEqualTo("Alpha Brokers received notification: Stock market went STOCK_DOWN to 145.50" + System.lineSeparator() +
                            "Zenith Investments received notification: Stock market went STOCK_DOWN to 145.50" + System.lineSeparator());
            // Expected console output:
            // Alpha Brokers received notification: Stock market went DOWN to 145.50
            // Zenith Investments received notification: Stock market went DOWN to 145.50

        } finally {
            System.setOut(originalOut);
        }
    }
}