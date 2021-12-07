import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Killian
 * What: player2Score() & throwDice()
 * When: 2021-12-03
 * Suggestions for player2Score()
 * - We recommend to take the occurrence of null into consideration
 */

class TestThrowDicePlayer2Score {

    BackEnd playerTest;
    @BeforeEach
    void initializeObject(){
        playerTest = new BackEnd();
    }


    @Test
    void ShouldReturnStringPlayerNameAndScore() {
        //input:
        playerTest.setPlayer2("Killian");
        //when
        String result = playerTest.player2Score();

        //result
        assertEquals("Killian" + " Score: " + 0, result);
    }

    //Method should catch strings that are equal with null to avoid further complications
    @Test
    void ShouldNotReturnStringPlayerNameAndScore() {
        //input:
        playerTest.setPlayer2(null);
        //when
        String result = playerTest.player2Score();

        //result
        assertEquals("null" + " Score: " + 0, result);
    }


    @Test
    void throwDice() {
        //input
        int [] diceArray = new int[100];
        boolean isInRange = true;

        //when
        for (int i = 0; i < diceArray.length; i++){
            playerTest.throwDice();
            diceArray[i] = playerTest.getDice();
        }

        for (int j = 0; j < diceArray.length; j++){
            if (diceArray[j] < 1 && diceArray[j]>20){
                isInRange = false;
            }
        }

        //result
        assertTrue(isInRange);
    }


}