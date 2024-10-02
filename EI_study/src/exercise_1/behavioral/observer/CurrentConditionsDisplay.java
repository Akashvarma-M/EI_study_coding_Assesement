package exercise_1.behavioral.observer;

public class CurrentConditionsDisplay implements WeatherObserver {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
