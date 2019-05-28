package game;

import java.util.List;

public class Print {
    public static void main(String[] args) {
        Round round1 = new Round(new PlayerScore(1));
        Round round2 = new Round(new PlayerScore(0));
        Round round3 = new Round(new PlayerScore(1));
        Round round4 = new Round(new PlayerScore(0));
        Round round5 = new Round(new PlayerScore(0));
        Round round6 = new Round(new PlayerScore(1));

        Game game = new Game();

        game.add(round1);
        game.add(round2);
        game.add(round3);
        game.add(round4);
        game.add(round5);
        game.add(round6);

        game.calculateAllScores();
        StringBuilder stringBuilder1 = new StringBuilder("Games Scores for player 1 : ");
        StringBuilder stringBuilder2 = new StringBuilder("Games Scores for player 2 : ");
        List<Round> rounds = game.getRounds();
        for (Round theRound : rounds) {
            stringBuilder1.append("Point : ").append(theRound.getPlayerScore1().getPoint()).append(" , Score: ").append(theRound.getPlayerScore1().getScore()).append(" , ");
            stringBuilder2.append("Point : ").append(theRound.getPlayerScore2().getPoint()).append(" , Score: ").append(theRound.getPlayerScore2().getScore()).append(" , ");
        }

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }
}
