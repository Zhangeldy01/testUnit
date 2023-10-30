package seminar4;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    @Test
    void testDummyPaymentProcessor() {
        PaymentGateway dummyGateway = new DummyPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(dummyGateway);

        // Теперь можно тестировать PaymentProcessor  с использованием DummyPaymentGateway
        boolean result = processor.makePayment(1000.0);

        assertTrue(result);
    }

    @Test
    void testStubPaymentProcessor() {
        PaymentGateway stubGateway = new StubPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(stubGateway);

        // Теперь можно тестировать PaymentProcessor  с использованием StubPaymentGateway
        boolean result = processor.makePayment(50.0);

        assertTrue(result);
    }

    @Test
    void testSpyPaymentProcessor() {
        PaymentGateway spyGateway = new StubPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(spyGateway);

        // Вызываем метод makePayment
        boolean result = processor.makePayment(100.0);

        // Проверяем, что processPayment метод был вызван
        assertEquals(1, ((SpyPaymentGateway) spyGateway).getProcessPaymentCallCount());

        // Проверяем результат
        assertTrue(result);
    }

    @Test
    void testFakePaymentProcessor() {
        PaymentGateway fakeGateway = new FakePaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(fakeGateway);

        // Вызываем метод makePayment с разными суммами
        processor.makePayment(100.0);
        processor.makePayment(50.0);
        processor.makePayment(200.0);

        // Получаем историю платежей
        List<Double> paymentHistory = ((FakePaymentGateway) fakeGateway).getPaymentHistory();

        // Проверяем, что платежи были записаны правильно
        assertEquals(3, paymentHistory.size());
        assertEquals(100.0, paymentHistory.get(0));
        assertEquals(50.0, paymentHistory.get(1));
        assertEquals(200.0, paymentHistory.get(2));
    }
}
