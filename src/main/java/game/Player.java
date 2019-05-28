package game;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private List<PlayerScore> playerScores;
    private boolean isWinner;

    Player(String name) {
        isWinner = false;
        this.playerScores = new ArrayList<PlayerScore>();
        playerScores.add(new PlayerScore(0,0));
    }

    List<PlayerScore> addPlayerScore(PlayerScore playerScore){
        playerScores.add(playerScore);
        calculateAllScores();
        return playerScores;
    }

    private void calculateAllScores() {
        int pointTotal = 0;
        for (PlayerScore playerScore : playerScores) {
            pointTotal = playerScore.addPoint(pointTotal);
            playerScore.setScore(calculateScore(pointTotal));
        }
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

    public String getName() {
        return name;
    }

    boolean isWinner() {
        return isWinner;
    }

    List<PlayerScore> getPlayerScores() {
        return playerScores;
    }
}
