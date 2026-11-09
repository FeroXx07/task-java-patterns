package decorator.components;

import decorator.BubbleTea;

public class LatteBase implements BubbleTea {

    private final String description = "Latte Bubble Tea";
    private final double cost = 3.5d;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
