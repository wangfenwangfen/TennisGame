package game;

import java.util.ArrayList;
import java.util.List;

class Game {
    private static final int POINT = 1;
    private static final int POINT_ZERO = 0;
    private List<Round> rounds;
    private Player player1;
    private Player player2;

    List<Score> getScoresForPlayer(Player player) {
        List<Score> scoresList;

        if (player.equals(player1)) {
            scoresList = player1.getScores();
        } else {
            scoresList = player2.getScores();
        }
        return scoresList;
    }

    void addRound(Player winner) {
        if (!isGameOver()) {
            rounds.add(new Round(winner));
            generateScores(winner);
            initPlayerScoreForPlayers();
        } else {
            throw new IllegalArgumentException("Can not add Round, because Game is Over ! ");
        }
    }

    private void generateScores(Player winner) {
        if (winner.equals(player1)) {
            player1.winPoint(POINT);
            player1.addScores(new Score(POINT, player1.calculateScore()));
            player2.addScores(new Score(POINT_ZERO, player2.calculateScore()));
        } else {
            player2.winPoint(POINT);
            player2.addScores(new Score(POINT, player2.calculateScore()));
            player1.addScores(new Score(POINT_ZERO, player1.calculateScore()));
        }
    }

    private void initPlayerScoreForPlayers() {
        if (isGameOver()) {
            player1.initLastScore();
            player2.initLastScore();
        }
    }

    private boolean isGameOver() {
        return winner() != null;
    }

    Player winner() {
        if (player1.isWinner())
            return player1;
        if (player2.isWinner())
            return player2;
        return null;
    }

    Game(Player player1, Player player2) {
        this.rounds = new ArrayList<Round>();
        this.player1 = player1;
        this.player2 = player2;
    }


}