package test;

import com.exercises.model.BowlingGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void testGetBowlingScore() {
        //Arrange
        BowlingGame game = new BowlingGame();

        //Act
        int score = game.getTotalBowlingScore("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");

        //Assert
        assertEquals(90, score);
    }
}
