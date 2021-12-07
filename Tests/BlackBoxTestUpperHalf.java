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





}
