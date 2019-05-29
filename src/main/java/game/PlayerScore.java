package game;

public class PlayerScore {

    private int point;
    private int score;

    PlayerScore(int point) {
        this.point = point;
    }

    PlayerScore(int point, int score) {
        this.point = point;
        this.score = score;
    }

    PlayerScore pointOfOpponent() {
        PlayerScore playerScoreOpponent = new PlayerScore(0,0);
        if (this.point == 0) {
            playerScoreOpponent.point = 1;
        } else {
            playerScoreOpponent.point = 0;
        }
        return playerScoreOpponent;
    }

    int addPoint(int pointTotal) {
        pointTotal += this.point;
        return pointTotal;
    }

    int getPoint() {
        return point;
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerScore playerScore = (PlayerScore) o;

        if (point != playerScore.point) return false;
        return score == playerScore.score;
    }

    @Override
    public int hashCode() {
        int result = point;
        result = 31 * result + score;
        return result;
    }

    @Override
    public String toString() {
        return "PlayerScore{" +
                "point=" + point +
                ", score=" + score +
                '}';
    }
}
