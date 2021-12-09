import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: getWinner()
 * What: getCurrentName
 * Number of Failures: 1 (of 8)
 */

class BackEndTestGetWinnerGetCurrentName {


    BackEnd playerTest;

    @BeforeEach
    void initializeObject() {
        playerTest = new BackEnd();
    }

    /** GetWinner **/

    @org.junit.jupiter.api.Test
    void shouldReturnPlayerWithHighestScore() {
        //Input
        playerTest.setP1Score(20);
        playerTest.setPlayer1("Niklas");

        //When
        String result = playerTest.getWinner();

        //Result
        assertEquals("And the winner is.... " + "Niklas" + "!!!", result);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnPlayerWithHighestScore2() {
        //Input
        playerTest.setP2Score(20);
        playerTest.setPlayer2("Lisa");

        //When
        String result = playerTest.getWinner();

        //Result
        assertEquals("And the winner is.... " + "Lisa" + "!!!", result);
    }


    // Found a failure, maybe add an other if statement to catch the possibility of two equal values
    @org.junit.jupiter.api.Test
    void shouldReturnNothing() {

        //Input
        playerTest.setP1Score(30);
        playerTest.setPlayer1("Niklas");
        playerTest.setP2Score(30);
        playerTest.setPlayer2("Lisa");

        //When
        String result = playerTest.getWinner();

        //Result
        assertEquals("", result);
    }

    // Players name should not be null, maybe add a method to check the players name or change the constructor
    @org.junit.jupiter.api.Test
    void shouldNotReturnName() {

        //Input
        playerTest.setP1Score(40);
        playerTest.setPlayer1(null);

        //When
        String result = playerTest.getWinner();

        //Result
        assertEquals("And the winner is.... " + "null" + "!!!", result);
    }

    /** CurrentPlayerName **/


    @org.junit.jupiter.api.Test
    void shouldGetCurrentPlayer1() {

        //Input
        playerTest.setCurrentPlayer(1);
        playerTest.setPlayer1("Player1");

        //When
        String result = playerTest.currentPlayerName();

        //Result
        assertEquals("Player1", result);
    }

    @org.junit.jupiter.api.Test
    void shouldGetCurrentPlayer2() {

        //Input
        playerTest.setCurrentPlayer(2);
        playerTest.setPlayer2("Player2");

        //When
        String result = playerTest.currentPlayerName();

        //Result
        assertEquals("Player2", result);
    }


    // If you type in a wrong input
    @org.junit.jupiter.api.Test
    void shouldGetNoCurrentPlayer() {

        //Input
        playerTest.setCurrentPlayer(3);

        //When
        String result = playerTest.currentPlayerName();

        //Result
        assertEquals("Wrong input - try again", result);

    }

    // If you type in a negative number
    @org.junit.jupiter.api.Test
    void shouldGetNoCurrentPlayerAgain() {

        //Input
        playerTest.setCurrentPlayer(-4);

        //When
        String result = playerTest.currentPlayerName();

        //Result
        assertEquals("Wrong input - try again", result);
    }

}
