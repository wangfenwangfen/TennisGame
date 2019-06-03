package game;

import org.junit.Test;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void score_of_player_should_be_0_when_game_start() {
        Player player1 = new Player("Player1");
        Player player2 = new Player("player2");
        Game game = new Game(player1, player2);

       List<Score> scores =  game.getScoresForPlayer(player1);
       List<Score> scoresExpected = new ArrayList<Score>();
       scoresExpected.add(new Score(0,0));

        assertThat(scores).isEqualTo(scoresExpected);
    }

    @Test
    public void should_return_the_right_scores_for_player1_with_last_score_initialise_to_0_if_game_over() {
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

        List<Score> scoresPlayer1Expected = new ArrayList<Score>();
        scoresPlayer1Expected.add(new Score(0, 0));
        scoresPlayer1Expected.add(new Score(1, 15));
        scoresPlayer1Expected.add(new Score(1, 30));
        scoresPlayer1Expected.add(new Score(0, 30));
        scoresPlayer1Expected.add(new Score(1, 40));
        scoresPlayer1Expected.add(new Score(0, 40));
        scoresPlayer1Expected.add(new Score(0, 40));
        scoresPlayer1Expected.add(new Score(0, 0));

        assertThat(scores1).isEqualTo(scoresPlayer1Expected);

    }

    @Test
    public void should_return_the_right_scores_for_player2_with_last_score_initialise_to_0_if_game_over() {
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

        List<Score> scores2 = game.getScoresForPlayer(player2);

        List<Score> scoresPlayer2Expected = new ArrayList<Score>();
        scoresPlayer2Expected.add(new Score(0, 0));
        scoresPlayer2Expected.add(new Score(0, 0));
        scoresPlayer2Expected.add(new Score(0, 0));
        scoresPlayer2Expected.add(new Score(1, 15));
        scoresPlayer2Expected.add(new Score(0, 15));
        scoresPlayer2Expected.add(new Score(1, 30));
        scoresPlayer2Expected.add(new Score(1, 40));
        scoresPlayer2Expected.add(new Score(1, 0));

        assertThat(scores2).isEqualTo(scoresPlayer2Expected);
    }


    @Test(expected = IllegalArgumentException.class)
    public void should_not_add_round_if_game_over() {
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
        game.addRound(player1);
    }

    @Test
    public void should_return_the_winner_player2() {
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

        Player winner = game.winner();

        assertThat(winner).isEqualTo(player2);
    }

}