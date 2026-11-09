package decorator.decorators;

import decorator.BubbleTea;
import decorator.BubbleTeaDecorator;

public class Flavor extends BubbleTeaDecorator {

    {
        this.cost = 0.60d;
    }

    public Flavor(BubbleTea bubbleTea, String flavor) {
        super(bubbleTea);
        this.description = "Flavor: " + flavor;
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
