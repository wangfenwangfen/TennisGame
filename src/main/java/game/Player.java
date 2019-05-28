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

    int calculatePointsTotal(){
        int pointsTotal = 0;
        for(PlayerScore playerScore : playerScores){
           pointsTotal = playerScore.addPoint(pointsTotal);
        }
        return pointsTotal;
    }
}
