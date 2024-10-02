package exercise_1.structural.decorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}