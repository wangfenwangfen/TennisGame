package game;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameWinnerTest {
    @Test
    public void should_return_the_winner() {

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

        Player winner = game.winner();

        assertThat(winner).isEqualTo(player2);
    }
}
