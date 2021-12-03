import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Lisa
 * What: invert()
 * When: 2021-12-03
 * Basis: german alphabet
 * Number of Failures: 7 out of 12
 *
 * Suggestions for the method invert():
 *      - check length of the String before inverting it to avoid java.lang.StringIndexOutOfBoundsExceptions (reliability/robusthet)
 *      - to handle the occurrence of a String that is null? (@shouldNotBeNull -> is this a good strategy?)
 *      - check the occurrence of two (or more) equal consecutive letters
 */

public class BlackBoxTestInvert {

    @Test
    void shouldInvertLetters(){
        //input
        String testString = "ßqwertzuiopüäölkjhgfdsayxcvbnm";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("mnbvcxyasdfghjklöäüpoiuztrewqß",result);
    }

    @Test
    void shouldInvertLettersInUpperCase(){
        //input
        String testString = "QWERTZUIOPÜÄÖLKJHGFDSAYXCVBNM";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("MNBVCXYASDFGHJKLÖÄÜPOIUZTREWQ",result);
    }

    @Test
    void shouldInvertNumbers(){
        //input
        String testString = "1234567890";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("0987654321",result);
    }

    @Test
    void shouldInvertSigns(){
        //input
        String testString = "!\"§$%&/()=?`*'}][{+~#-.,:;<>|°^ ";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals(" ^°|><;:,.-#~+{[]}'*`?=)(/&%$§\"!",result);
    }

    @Test
    void shouldHandleLongStrings(){
        //input
        int i = 0;
        String testString = "";
        String controlString = "";

        while(i<1000) {
            testString = testString.concat("jk");
            controlString = controlString.concat("kj");
            i++;
        }

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals(controlString,result);
    }

    //adds two letters
    @Test
    void shouldHandleSameLetters(){
        //input
        String testString = "aaaaa";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("aaaaa",result);
    }

    //adds a letter in front of the inverted String and in the end
    @Test
    void shouldHandleSameVowels2(){
        //input
        String testString = "Haar";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("raaH",result);
    }

    //doesn't matter if they are consonats or vowels
    @Test
    void shouldHandleSameConsonants(){
        //input
        String testString = "Alle";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("ellA",result);
    }

    //doesn't matter if they are letters or signs
    @Test
    void shouldHandleSameSigns(){
        //input
        String testString = "?!!?";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("?!!?",result);
    }

    //Exception: java.lang.StringIndexOutOfBoundsException: String index out of range: 1
    @Test
    void shouldHandleShortStrings(){
        //input
        String testString = "a";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("a",result);
    }

    //Exception: java.lang.StringIndexOutOfBoundsException: String index out of range: 1
    @Test
    void shouldHandleEmptyStrings(){
        //input
        String testString = "";

        //when
        String result = Iqh.invert(testString);

        //result
        assertEquals("",result);
    }

    // Exception: java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "in" is null
    @Test
    void shouldHandleNull(){
        //input
        String testString = null;

        //when
        String result = Iqh.invert(testString); //specs? Should it crash?

        //result
        assertEquals("llun",result);
    }



}
