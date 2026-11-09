package decorator.decorators;

import decorator.BubbleTea;
import decorator.BubbleTeaDecorator;

public class Ice extends BubbleTeaDecorator {

    {
        this.description = "Ice";
        this.cost = 0.25d;
    }

    public Ice(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.description;
    }

    @Override
    public double getCost() {
        return super.getCost() + this.cost;
    }
}
