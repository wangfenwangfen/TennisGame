package game;

public class PlayerScore {

    private int point;
    private int Score;

    PlayerScore(int point) {
        this.point = point;
    }

    PlayerScore(int point, int score) {
        this.point = point;
        Score = score;
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

    void setPoint(int point) {
        this.point = point;
    }

    int getScore() {
        return Score;
    }

    void setScore(int score) {
        Score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerScore playerScore = (PlayerScore) o;

        if (point != playerScore.point) return false;
        return Score == playerScore.Score;
    }

    @Override
    public int hashCode() {
        int result = point;
        result = 31 * result + Score;
        return result;
    }

    @Override
    public String toString() {
        return "PlayerScore{" +
                "point=" + point +
                ", Score=" + Score +
                '}';
    }
}
