package kiefer.kata.bowling;

/**
 * Created by moose on 4/22/2017.
 */

public class Game {

    private int score = 0;

    public Game(String score){
        parseScore(score);
    }

    public int getScore() {
        return score;
    }

    private void parseScore(String score){
        String bonus = "";
        String[] sections = score.split("\\|\\|");
        //bug here where no bonus frames would trip up the loop below, adding in bonus of -- to compensate
        bonus = sections.length > 1 ? sections[1] : "--";
        String[] frames = sections[0].split("\\|");
        char[] scores = stitchScores(frames, bonus);
        for (int i = 0; i < scores.length - 2; i++){
            calcScores(scores[i], scores[i+1], scores[i+2]);
            if (scores[i] != 'X'){
                i++;
            }
        }
    }

    private char[] stitchScores(String[] frames, String bonus){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < frames.length; ++i){
            sb.append(frames[i]);
        }
        sb.append(bonus);
        System.out.println("STITCHED: " + sb.toString());
        return sb.toString().toCharArray();
    }


    private void calcScores(char s1, char s2, char s3){
        int score1 = convertNum (s1);
        int score2 = convertNum (s2);
        int score3 = convertNum (s3);
        //couple of bugs here around handling spares since my caclNum function can't deal w/them
        if (s2 == '/'){
            score2 = 10 - score1;
        }
        if (s3 == '/'){
            score3 = 10 - score2;
        }
        System.out.println("Scores: " + score1 + ", " + score2 + ", " + score3);
        if (score1 == 10 || s2 == '/'){
            score += score1 + score2 + score3;
        }
        else {
            score += score1 + score2;
        }
    }

    private int convertNum(char pins){
        int retVal;
        switch(pins){
            case 'X':
                retVal = 10;
                break;
            case '-':
                retVal = 0;
                break;
            case '/':
                //punt on assigning a correct value so I don't have to pass in multiple params again
                retVal = 0;
                break;
            default:
                //had big bug here casting char to int directly ('9' == 57)
                retVal = Integer.parseInt(String.valueOf(pins));
        }
        return retVal;
    }
}

