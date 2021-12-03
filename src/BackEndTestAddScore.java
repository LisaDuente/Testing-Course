import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Lisa
 * What: AddScore()
 * When: 2021-11-30
 * Number of Failures: 4 (of 13)
 *
 * Suggestions for the method addScore():
 *     - if-statement to check if dice>20 or dice<0
 *     - if-statement to check p1Score> 100, p2Score>100
 *     - if-statement to check gameOver == false (?) Maybe changes in game structure to have a method
 *       to take care of this?
 */

class BackEndTestAddScore {
    BackEnd testBackEnd;

    @BeforeEach
    void initializeObject(){
        testBackEnd = new BackEnd();
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldAddToPlayer1() {
        //input
        testBackEnd.setCurrentPlayer(1);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(20,testBackEnd.getP1Score());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldAddToPlayer2() {
        //input
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(20,testBackEnd.getP2Score());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldSetDiceToZero() {
        //input
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getDice());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldSetRoundCounterToZero() {
        //input
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setRoundCounter(55);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getRoundCounter());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldNotAddAnything() {
        //input
        testBackEnd.setCurrentPlayer(3);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getP2Score());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldNotAddAnything2() {
        //input
        testBackEnd.setCurrentPlayer(-1);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getP1Score());
    }

    //Should this be part of the method or is there a different method that resets the playerScore?
    @org.junit.jupiter.api.Test
    void addScoreShouldNotAddAnything3() {
        //input
        testBackEnd.setCurrentPlayer(1);
        testBackEnd.setP1Score(100);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(100,testBackEnd.getP1Score());
    }

    //Does actually add negative numbers, need to fix this!
    @org.junit.jupiter.api.Test
    void addScoreShouldNotAddNegativNumbers() {
        //input
        testBackEnd.setCurrentPlayer(1);
        testBackEnd.setDice(-20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getP1Score());
    }

    //Does add more than 20 points to the score
    @org.junit.jupiter.api.Test
    void addScoreShouldNotAddNumbersHigherThan20() {
        //input
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setDice(30);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getP2Score());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldSetGameOverTrue() {
        //input
        testBackEnd.setCurrentPlayer(1);
        testBackEnd.setDice(20);
        testBackEnd.setP1Score(80);
        testBackEnd.setP2Score(60);

        //when
        testBackEnd.addScore();

        //result
        assertTrue(testBackEnd.gameOver());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldSetGameOverTrue2() {
        //input
        testBackEnd.setCurrentPlayer(1);
        testBackEnd.setDice(20);
        testBackEnd.setP1Score(90);
        testBackEnd.setP2Score(60);

        //when
        testBackEnd.addScore();

        //result
        assertTrue(testBackEnd.gameOver());
    }

    @org.junit.jupiter.api.Test
    void addScoreShouldHaveGameOverFalse() {
        //input
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setP2Score(70);
        testBackEnd.setDice(20);
        //when
        testBackEnd.addScore();

        //result
        assertFalse(testBackEnd.gameOver());
    }

    //is this important? Isn't it part of the game loop to check that this doesn't happen?
    @org.junit.jupiter.api.Test
    void addScoreShouldDoNothingBecauseGameOverTrue() {
        //input
        testBackEnd.setGameOver(true);
        testBackEnd.setCurrentPlayer(2);
        testBackEnd.setDice(20);

        //when
        testBackEnd.addScore();

        //result
        assertEquals(0,testBackEnd.getP2Score());
    }

}