package game;

import java.util.List;

public class Print {
    public static void main(String[] args) {
        Player player1 = new Player("Player1");
        Player player2 = new Player("player2");

        Game game = new Game(player1, player2);

        game.addRound(player1);
        game.addRound(player1);
        game.addRound(player2);
        game.addRound(player1);
        game.addRound(player2);
        game.addRound(player2);
        game.addRound(player2);

        List<Score> scores1 = game.getScoresForPlayer(player1);
        List<Score> scores2 = game.getScoresForPlayer(player2);

        StringBuilder stringBuilder1;
        stringBuilder1 = new StringBuilder("Games Scores for ");
        stringBuilder1.append(player1.getName());
        for (Score score : scores1) {
            stringBuilder1.append(" Point : ").append(score.getPoint()).append(" , Score: ").append(score.getScore()).append(" , ");
        }
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2;
        stringBuilder2 = new StringBuilder("Games Scores for ");
        stringBuilder2.append(player2.getName());

        for (Score score : scores2) {
            stringBuilder2.append(" Point : ").append(score.getPoint()).append(" , Score: ").append(score.getScore()).append(" , ");
        }
        System.out.println(stringBuilder2);

        System.out.println("The winner is " + game.winner().getName());
    }

}
