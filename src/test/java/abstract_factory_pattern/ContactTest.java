package abstract_factory_pattern;

import abstract_factory_pattern.abstract_factory.ContactFactory;
import abstract_factory_pattern.client.Contact;
import abstract_factory_pattern.concrete_factories.SpainContactFactory;
import abstract_factory_pattern.concrete_factories.USAContactFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactTest {

    @Test
    public void shouldContactGiveExpectedResult() {
        ContactFactory spainFactory = new SpainContactFactory(
                "Carrer Major 34", "Barcelona", "08001", "623456789"
        );
        Contact contactSpain = new Contact(spainFactory);
        assertThat(contactSpain.toString()).isEqualTo("Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89");

        ContactFactory usaFactory = new USAContactFactory(
                "154 5th Avenue", "New York", "NY 10001", "0987654321"
        );
        Contact contactUSA = new Contact(usaFactory);
        assertThat(contactUSA.toString()).isEqualTo("Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 (098) 765-4321");
    }

}
