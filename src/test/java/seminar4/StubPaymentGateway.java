package seminar4;

// Заглушка, всегда возвращает успешное выполнение платежа
public class StubPaymentGateway implements PaymentGateway{
    @Override
    public boolean processPayment(double amount) {
        // Имитация обработки платежа
        if (amount > 0) {
            return true; //успешный платеж
        } else{
            return false; // неуспешный платеж
        }
    }
}
