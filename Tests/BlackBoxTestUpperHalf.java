import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: upperHalf()
 * When: 2021-12-07
 *Number of Failures: 2 out of 9
 *
 * Suggestions for upperHalf():
 *    - how to handle long strings? There is a fault, if the even string is too long, it returns null
 *    - how to handle strings that are null? implement exception handling?
 *
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
   void checkAllNumbers(){
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

      while(j<500){
         control = control.concat("j");
         j++;
      }

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals(control, result);
   }

   @Test
   void shouldHandleEmptyString(){
      //input
      String testString = "";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("", result);
   }

   //how to handle a string that is null? Exception handling/ if-statement?
   @Test
   void shouldHandleStringsNull(){
      //input
      String testString = null;

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("ll", result);
   }

   @Test
   void shouldReturnStringUpperCase(){
      //input
      String testString = "ABCDEF";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("DEF", result);
   }

   @Test
   void shouldHandleLowerCaseStrings(){
      //input
      String testString = "asdfgh";

      //when
      String result = Iqh.upperHalf(testString);

      //result
      assertEquals("fgh", result);
   }

}
