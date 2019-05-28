package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Round> rounds;
    private String winner;

    Game() {
        Round p = new Round();
        rounds = new ArrayList<Round>();
        rounds.add(p);
    }

    void add(Round p) {
        rounds.add(p);
    }

    void calculateAllScores() {
        int pointTotal1 = 0;
        int pointTotal2 = 0;
        for (Round round : rounds) {
            pointTotal1 = calculatPointTotal(pointTotal1, round.getPlayerScore1());
            pointTotal2 = calculatPointTotal(pointTotal2, round.getPlayerScore2());
            round.getPlayerScore1().setScore(calculateScore(pointTotal1));
            round.getPlayerScore2().setScore(calculateScore(pointTotal2));
            chooseWinner(pointTotal1, pointTotal2, round);
        }
    }

    private void chooseWinner(int pointTotal1, int pointTotal2, Round round) {
        if (pointTotal1 == 4) {
            winner = "Player1";
            round.getPlayerScore2().setScore(0);
        }
        if (pointTotal2 == 4) {
            winner = "Player2";
            round.getPlayerScore1().setScore(0);
        }
    }

    private int calculatPointTotal(int pointTotal1, PlayerScore playerScore1) {
        pointTotal1 = playerScore1.addPoint(pointTotal1);
        return pointTotal1;
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
            return 0;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return rounds != null ? rounds.equals(game.rounds) : game.rounds == null;
    }

    @Override
    public int hashCode() {
        return rounds != null ? rounds.hashCode() : 0;
    }

    List<Round> getRounds() {
        return rounds;
    }

    String getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return "Game{" +
                "rounds=" + rounds +
                '}';
    }
}