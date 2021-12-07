import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Lisa
 * What: countConsonants()
 * When: 2021-12-03
 * Basis: german alphabet
 * Number of Failures: 4 of 10
 *
 * Suggestions for the method countConsonants():
 *     - should not count Vowels if they are in upper-case
 *     - should not count numbers (Character.isLetter())
 *     - should not count signs (Character.isLetter())
 *     - check cases where the string could be null, the program crashes in this case, reliability/robusthet?
 *     - think about user: which kind of alphabet are they going to use? (vowels and consonants could differ)
 */

public class BlackBoxTestCountConsonants {

    @Test
    void shouldCountConsonants(){
        //input
        String testString = "bcdfghjklmnpqrstvwxyzß";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(22,result);
    }

    @Test
    void shouldCountConsonantsInUpperCase(){
        //input
        String testString = "BCDFGHJKLMNPQRSTVWXYZ";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(21,result);
    }

    @Test
    void shouldIgnoreVowels(){
        //input
        String testString = "aeiou";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    //does count letters in uppercase
    @Test
    void shouldCheckUpperCase(){
        //input
        String testString = "AEIOU";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    @Test
    void shouldCheckVowelMutations(){
        //input
        String testString = "üöäå";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    //does count signs and empty spaces as consonants
    @Test
    void shouldIgnoreSigns(){
        //input
        String testString = "!\"§$%&/()=?`*'}][{+~#-.,:;<>|°^ ";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    //does count numbers as consonants
    @Test
    void shouldIgnoreNumbers(){
        //input
        String testString = "1234567890";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    @Test
    void shouldHandleEmptyStrings(){
        //input
        String testString = "";

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

    @Test
    void shouldHandleLongStrings(){
        //input
        int i = 0;
        String testString = "";
        while(i<1000) {
            testString = testString.concat("j");
            i++;
        }
        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(1000,result);
    }

    //program crashes if the string is null,
    @Test
    void shouldHandleNull(){
        //input
        String testString = null;

        //when
        int result = Iqh.countConsonants(testString);

        //result
        assertEquals(0,result);
    }

}
