import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: scatterString()
 * When: 2021-12-07
 * Number of Failures: 2 out of 2
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


}

