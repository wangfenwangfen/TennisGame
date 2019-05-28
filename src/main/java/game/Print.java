package game;

public class Print {
    public static void main(String[] args) {

        Player player1 = new Player("Player1");
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(0));

        Player player2 = new Player("Player2");
        player2.setPlayerScores(player1.pointsOfOppenent());
        player2.calculateAllScores(player2.getPlayerScores());

        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);


        StringBuilder stringBuilder;

        for (Player player : game.getPlayers()) {
            stringBuilder = new StringBuilder("Games Scores for ");
            stringBuilder.append(player.getName());
            for(PlayerScore playerScore : player.getPlayerScores()) {
                stringBuilder.append(" Point : ").append(playerScore.getPoint()).append(" , Score: ").append(playerScore.getScore()).append(" , ");
            }
            System.out.println(stringBuilder);
        }

        System.out.println("The winner is " + game.winner().getName());

    }
}
