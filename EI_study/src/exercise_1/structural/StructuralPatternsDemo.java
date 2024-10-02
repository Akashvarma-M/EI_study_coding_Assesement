package exercise_1.structural;

import exercise_1.structural.adapter.*;
import exercise_1.structural.decorator.*;

public class StructuralPatternsDemo {
    public static void runDemo() {
        System.out.println("Structural Patterns Demo");
        System.out.println("------------------------");
        
        demonstrateAdapterPattern();
        demonstrateDecoratorPattern();
    }

    private static void demonstrateAdapterPattern() {
        System.out.println("\nAdapter Pattern:");
        LegacyUser legacyUser = new LegacyUser();
        User adaptedUser = new LegacyUserAdapter(legacyUser);

        System.out.println("Name: " + adaptedUser.getName());
        System.out.println("Email: " + adaptedUser.getEmail());
    }

    private static void demonstrateDecoratorPattern() {
        System.out.println("\nDecorator Pattern:");
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}