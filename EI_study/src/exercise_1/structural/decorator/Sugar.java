package exercise_1.structural.decorator;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }
}
