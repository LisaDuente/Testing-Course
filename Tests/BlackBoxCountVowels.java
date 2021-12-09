import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Tester: Isabella
 * What: countVowels()
 * When: 2021-12-08
 * Number of failures: 2 out of 7
 *
 * Suggestions for the method countVowels():
 *    - Check upper or lower case with an if-statement?
 *    - take care of the occurrence of null
 */

public class BlackBoxCountVowels {

        //Doe not count vowels in upper case!
        @Test
        void shouldCountVowelsWithBigLetters(){ // Counts the number of vowels in the given String
            //input
            String test = "ABCDEFGHIJKLMNOPU";

            //when
            int result = Iqh.countVowels(test);

            //result
            assertEquals(4,result);

        }

        @Test
        void shouldCountVowelsWithSmallLetters(){
            //input
            String test = "abcdefghijklmnopu";

            //when
            int result = Iqh.countVowels(test);

            //result
            assertEquals(4,result);
        }

        @Test
        void shouldTakeCareIfStringIsNothing(){
            //input
            String test = "";

            //when
            int result = Iqh.countVowels(test);

            //result
            assertEquals(0, result);
        }

    @Test
    void shouldNotCountSigns(){
        //input
        String test = "!§$%&/()=?#'*+~";

        //when
        int result = Iqh.countVowels(test);

        //result
        assertEquals(0, result);
    }


    @Test
    void shouldNotCountNumbers(){
        //input
        String test = "1234567890";

        //when
        int result = Iqh.countVowels(test);

        //result
        assertEquals(0, result);
    }

    //take care of null, exception-handling?
    @Test
    void shouldTakeCareIfStringIsNull(){
            //input
        String test= null;

        //when
        int result = Iqh.countVowels(test);

        //result
        assertEquals(0,result);
    }

    @Test
    void shouldCountVowelsWithConsecutiveLetters(){
        //input
        String test= "Haar";

        //when
        int result = Iqh.countVowels(test);

        //result
        assertEquals(2,result);
    }

}
