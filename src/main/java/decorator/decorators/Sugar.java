package decorator.decorators;

import decorator.BubbleTea;
import decorator.BubbleTeaDecorator;

public class Sugar extends BubbleTeaDecorator {

    {
        this.description = "Sugar";
        this.cost = 0.30d;
    }

    public Sugar(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    public double getCost() {
        return super.getCost() + this.cost;
    }
}