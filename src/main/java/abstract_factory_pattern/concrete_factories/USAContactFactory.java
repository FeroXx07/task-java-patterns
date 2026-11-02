package abstract_factory_pattern.concrete_factories;

import abstract_factory_pattern.abstract_factory.ContactFactory;
import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.abstract_products.Phone;

public class USAContactFactory implements ContactFactory {
    public USAContactFactory(String street, String city, String code, String phoneNumber) {

    }

    @Override
    public Address createAddress() {
        return null;
    }

    @Override
    public Phone createPhone() {
        return null;
    }
}
