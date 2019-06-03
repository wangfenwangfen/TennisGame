package game;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int totalPoint;
    private List<Score> scores;
    private boolean isWinner;
    
    void addScores(Score score){
        scores.add(score);
    }
    
    int winPoint(int point){
        return totalPoint +=point;
    }
    Player(String name) {
        this.name = name;
        scores = new ArrayList<Score>();
        ScoreInitOfGameStart();
    }

    private void ScoreInitOfGameStart() {
        scores.add(new Score(0,0));
    }

    int calculateScore() {
        if (this.totalPoint == 1) {
            return 15;
        }
        if (this.totalPoint == 2) {
            return 30;
        }
        if (this.totalPoint == 3) {
            return 40;
        }
        if (this.totalPoint == 4)
            isWinner = true;
        return 0;
    }

    List<Score> initLastScore() {
        this.scores.get(scores.size()-1).setScore(0);
        return scores;
    }

    boolean isWinner() {
        return isWinner;
    }

    String getName() {
        return name;
    }

    List<Score> getScores() {
        return scores;
    }

    void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }
}
