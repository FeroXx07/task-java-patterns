package decorator.components;

import decorator.BubbleTea;

public class MatchaBase implements BubbleTea {

    private final String description = "Matcha Bubble Tea";
    private final double cost = 3.2d;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
