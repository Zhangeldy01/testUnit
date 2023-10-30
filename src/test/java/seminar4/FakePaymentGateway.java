package seminar4;

import java.util.List;
import java.util.ArrayList;

// Подделка, заменяет функциональность PaymentGateway
public class FakePaymentGateway implements PaymentGateway {
    private List<Double> paymentHistory = new ArrayList<>();
    @Override
    public boolean processPayment(double amount) {
        paymentHistory.add(amount);

// Здесь мы можем реализовать альтернативную функциональность
// Например, всегда успешное выполнение, но с другими действиями
// Это зависит от того, какой функциональности вам нужно подделать
// В данном случае, мы всегда возвращаем успешное выполнение платежа
        return true;
    }

    public List<Double> getPaymentHistory() {
        return paymentHistory;
    }
    //```
}
