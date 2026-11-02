package abstract_factory_pattern;


import abstract_factory_pattern.abstract_products.Phone;
import abstract_factory_pattern.concrete_products.SpainPhone;
import abstract_factory_pattern.concrete_products.USAPhone;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class PhoneTest {
    @Test
    public void shouldSpainGiveExpected(){
        Phone spainPhone = new SpainPhone("632445856");
        assertThat(spainPhone.getFormatted()).isEqualTo("+34 632 44 58 56");
    }

    @Test
    public void shouldFailSpainValidation(){
        Throwable throwableA = catchThrowable(() -> new SpainPhone("63244585"));
        assertThat(throwableA)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Phone number length must be 9 characters.");

        Throwable throwableB = catchThrowable(() -> new SpainPhone("6A244585%"));
        assertThat(throwableB)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Phone number must contain only digits.");
    }

    @Test
    public void shouldUSAGiveExpected(){
        Phone spainPhone = new USAPhone("0234567896");
        assertThat(spainPhone.getFormatted()).isEqualTo("+1 (023) 456-7896");
    }

    @Test
    public void shouldFailUSAValidation(){
        Throwable throwableA = catchThrowable(() -> new USAPhone("023456789"));
        assertThat(throwableA)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Phone number length must be 10 characters.");

        Throwable throwableB = catchThrowable(() -> new USAPhone("0234$67a96"));
        assertThat(throwableB)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Phone number must contain only digits.");
    }
}
