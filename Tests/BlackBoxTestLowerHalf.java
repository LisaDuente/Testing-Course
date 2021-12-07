import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Lisa
 * What: lowerHalf()
 * When: 2021-12-03
 * Basis: german alphabet
 * Number of Failures: 1 out of 10
 *
 * Suggestions for the method invert():
 *      - change the name of the method to firstHalf (?) to avoid misunderstandings
 *      - check the length of the string so that it doesn't return null for a very long string
 *      - how to handle empty strings? Now the method just returns the empty string
 */

public class BlackBoxTestLowerHalf {

    @Test
    void shouldReturnNull(){
        //input
        String testString = "Hallo";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertNull(result);
    }

    //returns upper half
    @Test
    void shouldReturnTheLowerHalfUpperCase(){
        //input
        String testString = "ALLE";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("AL", result);
    }

    //is not case-sensitiv
    @Test
    void shouldReturnTheLowerHalf(){
        //input
        String testString = "alle";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("al", result);
    }

    @Test
    void checkAllConsonants(){
        //input
        String testString = "bcdfghjklmnpqrstvwxyzß";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("bcdfghjklmn", result);
    }

    @Test
    void checkVowels1(){
        //input
        String testString = "aeio";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("ae", result);
    }

    @Test
    void checkVowels2(){
        //input
        String testString = "uieo";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("ui", result);
    }

    @Test
    void checkAllNumbers(){
        //input
        String testString = "1234567890";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("12345", result);
    }

    @Test
    void checkAllSigns(){
        //input
        String testString = "!\"§$%&/()=?`*'}][{+~#-.,:;<>|°^ ";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("!\"§$%&/()=?`*'}]", result);
    }

    //if the string is too long it returns null
    @Test
    void shouldHandleLongStrings(){
        //input
        int i = 0;
        int j = 0;
        String testString = "";
        String control = "";

        while(i<1000) {
            testString = testString.concat("j");
            i++;
        }

        while(j<500){
            control = control.concat("j");
            j++;
        }

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals(control, result);
    }

    @Test
    void shouldHandleShortStrings(){
        //input
        String testString = "aa";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("a", result);
    }

    @Test
    void shouldHandleEmptyStrings(){
        //input
        String testString = "";

        //when
        String result = Iqh.lowerHalf(testString);

        //result
        assertEquals("", result);
    }
}
