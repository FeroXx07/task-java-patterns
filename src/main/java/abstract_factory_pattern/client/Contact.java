package abstract_factory_pattern.client;

import abstract_factory_pattern.abstract_factory.ContactFactory;
import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.abstract_products.Phone;

public class Contact {
    private final Phone phone;
    private final Address address;

    public Contact(ContactFactory contactFactory){
        this.phone = contactFactory.createPhone();
        this.address = contactFactory.createAddress();
    }

    @Override
    public String toString() {
        return "Address: " + address.getFormatted() + " | " + "Phone: " + phone.getFormatted();
    }
}
