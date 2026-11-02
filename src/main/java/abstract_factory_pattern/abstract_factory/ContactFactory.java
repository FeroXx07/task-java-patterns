package abstract_factory_pattern.abstract_factory;

import abstract_factory_pattern.abstract_products.Address;
import abstract_factory_pattern.abstract_products.Phone;

public interface ContactFactory {
    Address createAddress();
    Phone createPhone();
}
