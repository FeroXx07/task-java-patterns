package decorator;

public abstract class BubbleTeaDecorator implements BubbleTea {
    protected String description;
    protected double cost;
    private final BubbleTea concreteComponent;

    protected BubbleTeaDecorator(BubbleTea bubbleTea) {
        this.concreteComponent = bubbleTea;
    }

    @Override
    public String getDescription() {
        return concreteComponent.getDescription();
    }

    @Override
    public double getCost() {
        return concreteComponent.getCost();
    }
}
