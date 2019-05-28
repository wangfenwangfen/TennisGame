package game;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private List<PlayerScore> playerScores;
    private boolean isWinner;

    Player() {
        isWinner = false;
        this.playerScores = new ArrayList<PlayerScore>();
    }

    void addPlayerScore(PlayerScore playerScore){
        playerScores.add(playerScore);
    }

    int calculateScore(int pointTotal) {
        if (pointTotal == 1) {
            return 15;
        }
        if (pointTotal == 2) {
            return 30;
        }
        if (pointTotal == 3) {
            return 40;
        }
        if (pointTotal == 4)
            isWinner = true;
        return 0;
    }

    int calculatePointsTotal(){
        int pointsTotal = 0;
        for(PlayerScore playerScore : playerScores){
           pointsTotal = playerScore.addPoint(pointsTotal);
        }
        return pointsTotal;
    }


}
