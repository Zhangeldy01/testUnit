package seminar4;

// Шпион, записывает информацию о вызовах методов
public class SpyPaymentGateway implements PaymentGateway {
    private int processPaymentCallCount = 0;
    @Override
    public boolean processPayment(double amount) {

        processPaymentCallCount++;
    // Возвращаем true, как настоящий платежный шлюз
        return true;
    }
    // Дополнительный метод для проверки количества вызовов
    public int getProcessPaymentCallCount() {
        return processPaymentCallCount;
    }
//```
}
