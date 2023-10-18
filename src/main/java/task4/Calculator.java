package task4;

public class Calculator {
    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }

    // ... другие методы, которые вы хотите протестировать

    /*
     * Задание 1. ** В классе Calculator создайте метод calculateDiscount,
     * который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
     * Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
     * Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
     * Не забудьте написать тесты для проверки этого поведения.
     */
    public double calculateDiscount(double purchaseAmount, double discountPercent){
        if (purchaseAmount < 0 || discountPercent < 0 || discountPercent > 100){
            throw new IllegalArgumentException("некорректные аргументы");
        }
        return purchaseAmount - (purchaseAmount * (discountPercent/100));
    }
}
