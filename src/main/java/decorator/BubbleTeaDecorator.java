package decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BubbleTeaDecorator implements BubbleTea {
    protected String description;
    protected double cost;
    private final BubbleTea concreteComponent;

    protected BubbleTeaDecorator(BubbleTea bubbleTea) {
        this.concreteComponent = bubbleTea;
    }

    @Override
    public String getDescription() {
        return concreteComponent.getDescription() + " + ";
    }

    @Override
    public double getCost() {
        return roundToNDecimalPlaces(concreteComponent.getCost(), 2);
    }

    private static double roundToNDecimalPlaces(double value, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
