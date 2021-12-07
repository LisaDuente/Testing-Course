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

   @Test
   void shouldReturnUpperHalfConsecutive() {
      //input
      String testString = "oooooo";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("ooo", result);

   }

   //can't handle long strings, where is the limit?
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

   //a test with really long strings

   //a test with empty strings

   //a test with a string that is null

   //(test with a string with just upper case)

   //(test with a string with just lower case)






}
