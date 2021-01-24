import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "Python", "JavaScript", "TypeScript"})
    void testCase1(String arg){

        assertTrue(!arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 27})
    void testCase2(int number){
        assertEquals(0, number % 3);
    }

    @ParameterizedTest
//    @EmptySource
//    @NullSource
    @NullAndEmptySource
    @ValueSource (strings = {"Java", "TypeScript"})
    void testCase3(String arg){
        assertTrue(arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg){
        assertNotNull(arg);
    }

    static String[] stringProvider(){
        String[] arr = {"Java", "JS", "Python"};
        return arr;
    }

    @ParameterizedTest
    @CsvSource({
            "10,50,60",
            "20,30,50",
            "20,40,60"
    })
    void testCase5(int num1, int num2, int expected){
        assertEquals(expected,Calculator.add(num1,num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sample_data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int expected){
        assertEquals(expected,Calculator.add(num1,num2));
    }
}
