package task4;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calculator;

    //улучшения!!!!
    private static final double INVALID_AMOUNT = -300;
    private static final double VALID_AMOUNT = 300;
    private static final double INVALID_DISCOUNT = -10;
    private static final double VALID_DISCOUNT = 15;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @BeforeAll
    public static void initAll() {
        System.out.printf("Hiii!!!!!");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("END!");    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Очистка после каждого теста
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(5, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    // Дополнительные ассерты
    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
    void testAssertWithLambdaMessage() {
        assertEquals(4, calculator.add(2, 2), () -> "2 + 2 должно быть равно 4");
    }

    // ДОМАШНЕЕ ЗАДАНИЕ 1
    @Test
    @DisplayName("Проверка метода calculateDiscount, который вычисляет скидку на основе суммы покупки и процента скидки")
    void testCalculateDiscount() {
        // Проверяем, что метод правильно вычисляет скидку для суммы покупки 300 и процента скидки 15.
        double result = calculator.calculateDiscount(300, 10);
        assertThat(result).isEqualTo(270);
    }
    // 2 вариант
//    @Test
//    @DisplayName("Проверка вычисления суммы с учетом скидки")
//    void testCalculateDiscount() {assertEquals(95, calculator.calculateDiscount(100, 5), "100 - (100 * 5%) должно быть равно 95");}

    @Test
    @DisplayName("Проверка исключений при вычислении суммы с учетом скидки ")
    void testAssertThrowsCalculateDiscount() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateDiscount(-1, 5));
    }
}
