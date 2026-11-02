package abstract_factory_pattern.concrete_products;

import abstract_factory_pattern.abstract_products.Address;

public class SpainAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public SpainAddress(String street, String city, String postalCode) {
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
        if (postalCode.length() != 5){
            throw new IllegalArgumentException("Spain postal code length should be 5 digits.");
        }
    }

    @Override
    public String getFormatted() {
        return street + ", " + postalCode + " " + city;
    }
}
