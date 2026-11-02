package abstract_factory_pattern.concrete_products;

import abstract_factory_pattern.abstract_products.Phone;

public class SpainPhone implements Phone {
    private final String number;
    private final int prefixCode = 34;

    public SpainPhone(String number) {
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(String number) {
        if (number == null) {
            throw new IllegalArgumentException("Phone number cannot be null.");
        }
        if (number.length() != 9) {
            throw new IllegalArgumentException("Phone number length must be 9 characters.");
        }
        if (!number.chars().allMatch(Character::isDigit)){
            throw new IllegalArgumentException("Phone number must contain only digits.");
        }
    }

    @Override
    public String getFormatted() {
        return "+" + prefixCode + " " + number.substring(0,3) + " " +  number.substring(3,5) + " " + number.substring(5, 7) + " " + number.substring(7, 9);
    }
}
