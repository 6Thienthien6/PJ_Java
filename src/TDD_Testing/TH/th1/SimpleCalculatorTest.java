package TDD_Testing.TH.th1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Test add 0 + 0 ")
    public void testAdd0and0(){
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 5 + 9")
    public void testAdd5And9() {
        int first = 5;
        int second = 9;
        int expected = 14;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 3 - 1")
    public void testSub3and1() {
        int first = 3;
        int second = 1;
        int expected = 2;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 1")
    public void testSub1and1() {
        int first = 1;
        int second = 1;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 5 - 3")
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}
