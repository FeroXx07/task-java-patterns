package abstract_factory_pattern.concrete_products;

import abstract_factory_pattern.abstract_products.Address;

public class USAAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public USAAddress(String street, String city, String postalCode) {
        validateAddress(street, city, postalCode);
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    private void validateAddress(String street, String city, String postalCode){
        if (street == null || street.isBlank()){
            throw new IllegalArgumentException("Street address cannot be null or blank.");
        }
        if (city == null || city.isBlank()){
            throw new IllegalArgumentException("City address cannot be null or blank.");
        }
        if (postalCode == null || postalCode.isBlank()){
            throw new IllegalArgumentException("Postal code address cannot be null or blank.");
        }
    }
    @Override
    public String getFormatted() {
        return street + ", " + city + ", " + postalCode;
    }
}
