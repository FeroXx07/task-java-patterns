package abstract_factory_pattern.concrete_products;

import abstract_factory_pattern.abstract_products.Address;

public class SpainAddress implements Address {
    @Override
    public String getFormatted() {
        return "";
    }
}
