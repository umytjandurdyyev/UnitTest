import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

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

}
