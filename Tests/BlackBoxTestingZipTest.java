import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Killian
 * What: zip()
 * When: 2021-12-07
 * Number of failures: 3 of 9
 *
 * Suggestions for the method zip()
 *    - take care of the occurrence of null with if-statements or exception handler
 *    - check the length of the input strings before zipping (is this a design decision?)
 */

class BlackBoxTestingZipTest {

    @Test
    void shouldZipTwoLowerCaseStrings() {
        //input
        String in = "abc";
        String in2 = "def";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("adbecf", testZipResult);
    }

    @Test
    void shouldZipTwoUpperCaseStrings() {

        //input
        String in = "ABC";
        String in2 = "DEF";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("ADBECF", testZipResult);
    }

    @Test
    void shouldZipTwoNumberStrings() {

        //input
        String in = "123";
        String in2 = "456";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("142536", testZipResult);
    }

    @Test
    void shouldZipTwoEmptyStrings() {

        //input
        String in = "";
        String in2 = "";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("", testZipResult);
    }

    @Test //specs should it crash? is an exception handler necessary
    void shouldZipTwoNullStrings() {

        //input
        String in = null;
        String in2 = null;

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("nnuullll", testZipResult);
    }

    @Test //how the handle strings that don't have the same size
    void shouldZipTwoUnEvenStrings() {

        //input
        String in = "abcd";
        String in2 = "ef";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("aebfcd", testZipResult);
    }

    @Test //how the handle strings that don't have the same size
    void shouldZipTwoUnEvenStrings2() {

        //input
        String in = "ab";
        String in2 = "cdef";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("acbdef", testZipResult);
    }

    @Test
    void shouldZipTwoMixedCasesStrings() {

        //input
        String in = "ABC";
        String in2 = "def";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("AdBeCf", testZipResult);
    }

    @Test
    void shouldZipTwoSignsStrings() {

        //input
        String in = "@&%";
        String in2 = ")=?";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("@)&=%?", testZipResult);
    }

    @Test //the method creates the new string, depending on the shortest input
    void shouldZipOneEmptyAndOneFilledString() {

        //input
        String in = "";
        String in2 = "abc";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("abc", testZipResult);


    }

    @Test //the method creates the new string, depending on the shortest input
    void shouldZipOneEmptyAndOneFilledString2() {

        //input
        String in = "abc";
        String in2 = "";

        //when
        String testZipResult = Iqh.zip(in, in2);
        //result
        assertEquals("abc", testZipResult);
    }
}

