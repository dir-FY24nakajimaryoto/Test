package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
//        fail("まだ実装されていません"); // default
        Calculator calculator = new Calculator();
        // assertEquals: 第１引数と第２引数が等しいかどうかを判定
        assertEquals(4, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
//        fail("まだ実装されていません"); // default
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
    }

}
