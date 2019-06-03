package game;

public class Score {

    private int point;
    private int Score;

    Score(int point, int score) {
        this.point = point;
        Score = score;
    }

    void setScore(int score) {
        Score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (point != score.point) return false;
        return Score == score.Score;
    }

    int getPoint() {
        return point;
    }

    int getScore() {
        return Score;
    }

    @Override
    public int hashCode() {
        int result = point;
        result = 31 * result + Score;
        return result;
    }

    @Override
    public String toString() {
        return "Score{" +
                "point=" + point +
                ", Score=" + Score +
                '}';
    }
}
