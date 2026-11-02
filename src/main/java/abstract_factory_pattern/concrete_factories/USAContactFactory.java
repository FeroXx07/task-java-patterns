package abstract_factory_pattern.concrete_factories;

import abstract_factory_pattern.abstract_factory.ContactFactory;
import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.abstract_products.Phone;
import abstract_factory_pattern.concrete_products.USAAddress;
import abstract_factory_pattern.concrete_products.USAPhone;

public class USAContactFactory implements ContactFactory {

    private final String street;
    private final String city;
    private final String code;
    private final String phoneNumber;

    public USAContactFactory(String street, String city, String code, String phoneNumber) {
        this.street = street;
        this.city = city;
        this.code = code;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address createAddress() {
        return new USAAddress(street, city, code);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(phoneNumber);
    }
}
