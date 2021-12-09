import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: scatterString()
 * When: 2021-12-07
 * Number of Failures: 1 out of 8
 *
 * Suggestions for scatterString():
 *  - check for consecutive letters: the method adds a letter if two or more consecutive letters exist
 */

public class BlackBoxTestScatterString {

// String is randomized but its hard to guess what its randomized to
    @Test
    void shouldRandomizeChars(){

        //input
        String testString = "Niklas";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("lsaikN", result);
    }

    // String is randomized in uppercase but its hard to guess what its randomized to
    @Test
    void shouldRandomizeCharUpperCase(){

        //input
        String testString = "NIKLAS";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("KASLNI", result);

    }

    @Test
    void shouldHandleEmtyString() {

        //input
        String testString = "";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("", result);
    }
    // String is randomized but its hard to guess what its randomized to
        @Test
        void shouldHandleLongStrings(){
            //input
            int i = 0;
            int j = 0;
            String testString = "";
            String control = "";

            while(i<1000) {
                testString = testString.concat("jk");
                i++;
            }

            while(j<1000){
                control = control.concat("jk");
                j++;
            }

            //when
            String result = Iqh.scatterString(testString);

            //result
            assertEquals(control, result);
        }

    @Test
    void shouldRandomizeNumbers() {

        //input
        String testString = "123456";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("345216", result);
    }

    @Test
    void shouldHandleSignsInString () {

        //input
        String testString = "!§$%&/()=?@'#+ ";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("!§$%&/()=?@'#+ ", result);
    }

// Adds a letter when you use consecutive letters
    @Test
    void shouldHandleConsecutiveInString() {

        //input
        String testString = "uuuuuuuiu";

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("iuuuuuu", result);
    }

    @Test
    void shouldHandleNull() {

        //input
        String testString = null;

        //when
        String result = Iqh.scatterString(testString);

        //result
        assertEquals("null", result);
    }

}

