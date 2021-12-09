import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Isabella
 * What: Size()
 * When: 2021-12-08
 * Failures: 2 of 7
 *
 * suggestions for size():
 *  *       - counts really long strings but seems to negate the count
 *          - take care of the occurrence of null
 */

public class BlackBoxTestSize {

    @Test
    void shouldReturnLength() { // return the length of the given String
        // input
        String test = "ISABELLA";

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(8, result);
    }


    @Test
    void shouldReturnLength2() { // return the length of the given String
        // input
        String test = "isabella";

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(8, result);
    }

    @Test
    void shouldReturnZero() {
        // input
        String test = "";

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(0, result);
    }

    //counts the length of the string but then negates it
    @Test
    void shouldCountLongString() {
        // input
        String test = "";
        int i = 0;
        while (i < 1000) {
            test = test.concat("I");
            i++;
        }

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(1000, result);
    }

    // how to handle null? exception-handling?
    @Test
    void shouldHandleNull() {
        //input
        String test = null;

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(0, result);

    }

    @Test
    void shouldHandleNumbers() {
        //input
        String test = "172328291";

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(9, result);
    }

    @Test
    void shouldCountSigns() {
        // input
        String test = "!§$%&/()=?`*'_:;>";

        //when
        int result = Iqh.size(test);

        //result
        assertEquals(17, result);
    }
}
