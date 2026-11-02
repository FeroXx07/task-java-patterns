package abstract_factory_pattern.client;

import abstract_factory_pattern.abstract_factory.ContactFactory;
import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.abstract_products.Phone;

public class Contact {
    private Phone phone;
    private Address address;

    public Contact(ContactFactory contactFactory){
        this.phone = contactFactory.createPhone();
        this.address = contactFactory.createAddress();
    }

    public void printContact(){

    }
}
