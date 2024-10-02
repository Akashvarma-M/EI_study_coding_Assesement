package exercise_1.behavioral;

import exercise_1.behavioral.observer.*;
import exercise_1.behavioral.strategy.*;

public class BehavioralPatternsDemo {
    public static void runDemo() {
        System.out.println("Behavioral Patterns Demo");
        System.out.println("------------------------");
        
        demonstrateObserverPattern();
        demonstrateStrategyPattern();
    }

    private static void demonstrateObserverPattern() {
        System.out.println("\nObserver Pattern:");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
    }

    private static void demonstrateStrategyPattern() {
        System.out.println("\nStrategy Pattern:");
        PaymentContext context = new PaymentContext();
        
        context.setPaymentStrategy(new CreditCardPayment());
        context.processOrder(100);
        
        context.setPaymentStrategy(new PayPalPayment());
        context.processOrder(200);
    }
}