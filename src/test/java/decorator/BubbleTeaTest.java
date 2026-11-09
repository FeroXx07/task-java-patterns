package decorator;

import decorator.components.LatteBase;
import decorator.components.MatchaBase;
import decorator.decorators.Flavor;
import decorator.decorators.Ice;
import decorator.decorators.Sugar;
import decorator.decorators.Tapioca;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.*;

class BubbleTeaTest {
    private PrintStream originalOut;
    private ByteArrayOutputStream output;
    @BeforeEach
    void setUp(){
        originalOut = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void cleanUp(){
        System.setOut(originalOut);
    }

    @Test
    void shouldCreateCombinationACorrectOrder(){
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getDescription()).isEqualTo("Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango");
    }

    @Test
    void shouldCreateCombinationBCorrectOrder(){
        BubbleTea tea = new MatchaBase();
        tea = new Flavor(tea, "Maduixa");
        tea = new Ice(tea);
        tea = new Ice(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getDescription()).isEqualTo("Matcha Bubble Tea + Flavor: Maduixa + Ice + Ice + Sugar + Flavor: Mango");
    }

    @Test
    void shouldCalculateCostCombinationA(){
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getCost()).isCloseTo(5.50d, within(0.001));
    }

    @Test
    void shouldCalculateCostCombinationB(){
        BubbleTea tea = new MatchaBase();
        tea = new Flavor(tea, "Maduixa");
        tea = new Ice(tea);
        tea = new Ice(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getCost()).isCloseTo(5.20d, within(0.001));
    }
}
