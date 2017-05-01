/**
 * Created by Peter on 4/28/2017.
 */

import org.junit.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static org.junit.Assert.*;

public class GameTests {

    @Test
    @TestCaseId("Terrible bowler test")
    public void givenATerribleBowlerThenTheScoreIsZero() {
        int expectedScore = 0;
        String badScore = "|--|--|--|--|--|--|--|--|--|--||";
        ScoreSheet terriblePlayer = new ScoreSheet(badScore);
        Game game = new Game(terriblePlayer);
        int result = game.getScore();
        assertTrue( "Expected a different score", expectedScore == result);
    }

    @Test
    @TestCaseId("Average bowler test")
    public void givenAnAverageBowlerThenTheScoreIsGiven() {
        int expectedScore = 107;
        String averageScore = "|-5|59|X|67|-4|19|48|3/|58|29||";
        ScoreSheet averagePlayer = new ScoreSheet(averageScore);
        Game game = new Game(averagePlayer);
        int result = game.getScore();
        assertTrue( "Expected a different score", expectedScore == result);
    }

    @Test
    @TestCaseId("Professional bowler test")
    public void givenAProfessionalBowlerThenTheScoreIsGiven() {
        int expectedScore = 300;
        String proScore = "|X|X|X|X|X|X|X|X|X|X|XX|";
        ScoreSheet proPlayer = new ScoreSheet(proScore);
        Game game = new Game(proPlayer);
        int result = game.getScore();
        assertTrue( "Expected a different score", expectedScore == result);
    }
}
