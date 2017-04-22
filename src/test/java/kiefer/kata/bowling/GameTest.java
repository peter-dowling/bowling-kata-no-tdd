package kiefer.kata.bowling;

import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void givenABowlingGameWhenNoPinsAreHitThenTheScoreIsZero() {
        int expected = 0;
        Game game = new Game("--|--|--|--|--|--|--|--|--|--||");
        int actual = game.getScore();
        assertEquals(expected, actual);
    }

    @Test
    public void allStrikes(){
        int expected = 300;
        Game game = new Game("X|X|X|X|X|X|X|X|X|X||XX");
        int actual = game.getScore();
        assertEquals(expected, actual);
    }

    @Test
    public void allFramesNines(){
        int expected = 90;
        Game game = new Game("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||");
        int actual = game.getScore();
        assertEquals(expected, actual);
    }

    @Test
    public void allRollsFive(){
        int expected = 150;
        Game game = new Game("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5");
        int actual = game.getScore();
        assertEquals(expected, actual);
    }

    @Test
    public void complexGame(){
        int expected = 167;
        Game game = new Game("X|7/|9-|X|-8|8/|-6|X|X|X||81");
        int actual = game.getScore();
        assertEquals(expected, actual);
    }
}

