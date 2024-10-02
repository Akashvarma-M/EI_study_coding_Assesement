package exercise_1.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processOrder(int amount) {
        paymentStrategy.pay(amount);
    }
}