/**
 * Created by Peter on 4/28/2017.
 */
public class Game {

    private int score;

    public Game(ScoreSheet scoreCard) {
        this.score = calculateScore(scoreCard);
    }

    public int getScore() {
        return this.score;
    }

    private int calculateScore(ScoreSheet scoreCard) {
        return scoreCard.calculateScore();
    }
}
