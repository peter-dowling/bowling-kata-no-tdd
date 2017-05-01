/**
 * Created by Peter on 4/28/2017.
 */
public class ScoreSheet {

    String scoreString = new String();
    String[] scoreArray = new String[]{};

    public ScoreSheet(String givenScore) {

        scoreString = givenScore;
        scoreArray = this.parseScore();
    }

    protected String[] parseScore() {
        return this.scoreString.split("\\|");
    }

    protected int calculateScore() {
        int score = 0;

        // note the index starts at 1, because the first string in the array is empty
        for (int i =1; i < scoreArray.length; i++) {
            if (scoreArray[i] == "X") {
                //todo strike scoring
            } else if (false) {
                // todo spare scoring
            } else {
                score += Integer.valueOf(scoreArray[i].substring(scoreArray[i].length()-1));
            }


        }

        return score;
    }

}
