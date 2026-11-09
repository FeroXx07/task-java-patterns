package decorator.components;

import decorator.BubbleTea;

public class TeaBase implements BubbleTea {

    private final String description = "Tea Bubble Tea";
    private final double cost = 3.0d;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
