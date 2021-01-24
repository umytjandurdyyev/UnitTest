import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        int actual = Calculator.add(2,3);
        assertEquals(5,actual);
    }
    @Test
    void testCase1() {
//        fail("Not implemented yet");
        boolean result = Calculator.add(2,3) == 5;
        assertTrue(result);
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase2(){
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        assertArrayEquals(new int[]{1,4,3}, new int[]{1,2,3});

    }
}