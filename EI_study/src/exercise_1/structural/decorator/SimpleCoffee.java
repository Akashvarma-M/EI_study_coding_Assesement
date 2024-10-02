package exercise_1.structural.decorator;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 1;
    }
}