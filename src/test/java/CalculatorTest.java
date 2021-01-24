import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        System.out.println("add method call");
        int actual = Calculator.add(2,3);
        assertEquals(5,actual);
    }
    @Test
    void testCase1() {
        System.out.println("TC1 executed");
//        fail("Not implemented yet");
        boolean result = Calculator.add(2,3) == 5;
        assertTrue(result);
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase2(){
        System.out.println("TC2 executed");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        assertArrayEquals(new int[]{1,4,3}, new int[]{1,2,3});
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("@BeforeEach is executed");
    }

    @AfterEach
    void tearEach(){
        System.out.println("@AfterAll is executed");
    }
    @BeforeAll
    static void setUpAll(){
        System.out.println("@BeforeAll is executed");
    }
    @AfterAll
    static void tearAll(){
        System.out.println("@AfterAll is executed");
    }
}