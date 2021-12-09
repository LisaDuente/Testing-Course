import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Bella
 * What: randomStarter() & player1Score
 * When: 2021-12-02
 *
 */

class BackEndPlayer1ScoreGetCurrentPlayer {
    BackEnd backEnd;

    @BeforeEach
    void initializeObject(){
        backEnd = new BackEnd();
    }

    @Test
    void shouldRandomizeOneOrTwo() {
        //inputs
        int [] array = new int[100];
        boolean bool = true;

        //when
        for (int i = 0; i< array.length; i++) {
            backEnd.randomStarter();
            array[i] = backEnd.getCurrentPlayer();
        }

        for(int j = 0; j< array.length; j++){
            if(array[j]>2 && array[j]<1){
                bool = false;
                break;
            }
        }

        //result
        assertTrue(bool);
    }

    @Test
    void shouldCheckProportionBetween1And2(){
        //input
        int [] array = new int[100];
        int counter1 = 0;
        int counter2 = 0;

        //when
        for (int i = 0; i < array.length; i++) {
            backEnd.randomStarter();
            array[i]= backEnd.getCurrentPlayer();
        }

        for(int j = 0; j< array.length; j++){
            if(array[j] == 1){
                counter1++;
            } else if(array[j] == 2) {
                counter2++;
            }
        }

        //result
        assertEquals(50, counter1);
    }

    @Test
    void testPlayer1Score() {
        //input
        String player1 = "";
        int p1Score = 0;

        //when
        String expected = player1 + " Score: " + p1Score;
        String actual = backEnd.getPlayer1()  + backEnd.player1Score();

        //result
        assertEquals( expected, actual);

    }

}
