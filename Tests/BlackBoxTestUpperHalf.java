import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: upperHalf()
 * When: 2021-12-07
 */

public class BlackBoxTestUpperHalf {

   @Test
   void shouldReturnUpperHalf() {

      //input
      String testString = "Niklas";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("las", result);
   }

   @Test
   void shouldReturnNull() {
      //input
      String testString = "Great";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertNull(result);

   }

   @Test
   void checkNumbers(){
      //input
      String testString = "1234567890";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("67890", result);
   }

   //a test with consecutive letters, because I found an exception in lower half with this

   //a test with really long strings

   //a test with empty strings

   //a test with a string that is null

   //(test with a string with just upper case)

   //(test with a string with just lower case)






}
