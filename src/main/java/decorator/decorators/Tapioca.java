package decorator.decorators;

import decorator.BubbleTea;
import decorator.BubbleTeaDecorator;

public class Tapioca extends BubbleTeaDecorator {

    {
        this.description = "Tapioca";
        this.cost = 0.50d;
    }

    public Tapioca(BubbleTea bubbleTea) {
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