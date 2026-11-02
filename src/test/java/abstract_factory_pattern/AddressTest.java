package abstract_factory_pattern;

import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.concrete_products.SpainAddress;
import abstract_factory_pattern.concrete_products.USAAddress;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class AddressTest {
    @Test
    public void shouldSpainGiveExpected(){
        Address spainAddress = new SpainAddress("Carrer de Lull 22", "Barcelona", "08020");
        assertThat(spainAddress.getFormatted()).isEqualTo("Carrer de Lull 22, 08020 Barcelona");
    }

    @Test
    public void shouldFailSpainValidation(){
        Throwable throwable = catchThrowable(() -> new SpainAddress("Carrer de Lull 22", "Barcelona", "00"));

        assertThat(throwable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Spain postal code length should be 5 digits.");
    }

    @Test
    public void shouldUSAGiveExpected(){
        Address spainAddress = new USAAddress("111 1st Avenue", "Miami", "28202");
        assertThat(spainAddress.getFormatted()).isEqualTo("111 1st Avenue, Miami, 28202");
    }

    @Test
    public void shouldFailUSAValidation(){
        Throwable throwable = catchThrowable(() -> new USAAddress("", "Miami", "28202"));

        assertThat(throwable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Street address cannot be null or blank.");
    }
}
