package decorator;

import decorator.components.LatteBase;
import decorator.components.MatchaBase;
import decorator.components.TeaBase;
import decorator.decorators.Flavor;
import decorator.decorators.Ice;
import decorator.decorators.Sugar;
import decorator.decorators.Tapioca;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class BubbleTeaTest {
    @Test
    void shouldAssertCorrectBasePrices() {
        assertThat(new LatteBase().getCost()).isEqualTo(3.5d);
        assertThat(new MatchaBase().getCost()).isEqualTo(3.2d);
        assertThat(new TeaBase().getCost()).isEqualTo(3.0d);
    }

    @Test
    void shouldCreateCombinationACorrectOrder() {
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getDescription()).isEqualTo("Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango");
    }

    @Test
    void shouldCreateCombinationBCorrectOrder() {
        BubbleTea tea = new MatchaBase();
        tea = new Flavor(tea, "Maduixa");
        tea = new Ice(tea);
        tea = new Ice(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getDescription()).isEqualTo("Matcha Bubble Tea + Flavor: Maduixa + Ice + Ice + Sugar + Flavor: Mango");
    }

    @Test
    void shouldCalculateCostCombinationA() {
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getCost()).isCloseTo(5.50d, within(0.001));
    }

    @Test
    void shouldCalculateCostCombinationB() {
        BubbleTea tea = new MatchaBase();
        tea = new Flavor(tea, "Maduixa");
        tea = new Ice(tea);
        tea = new Ice(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Mango");

        assertThat(tea.getCost()).isCloseTo(5.20d, within(0.001));
    }
}
