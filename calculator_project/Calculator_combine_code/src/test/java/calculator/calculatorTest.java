
package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class calculatorTest {

    @Test
    void testAddition() {
        assertEquals(15, add.addoperation(4, 5, 6));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, sub.suboperation(10, 2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(24, mul.muloperation(1, 2, 3, 4));
    }
}
