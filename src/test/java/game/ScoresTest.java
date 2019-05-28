package game;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoresTest {

    @Test
    public void should_return_the_right_score_for_all_rounds() {

        Round round1 = new Round(new PlayerScore(1));
        Round round2 = new Round(new PlayerScore(1));
        Round round3 = new Round(new PlayerScore(0));
        Round round4 = new Round(new PlayerScore(1));
        Round round5 = new Round(new PlayerScore(0));
        Round round6 = new Round(new PlayerScore(0));
        Round round7 = new Round(new PlayerScore(0));

        Game game = new Game();

        game.add(round1);
        game.add(round2);
        game.add(round3);
        game.add(round4);
        game.add(round5);
        game.add(round6);
        game.add(round7);

        game.calculateAllScores();

        Round round_1 = new Round(new PlayerScore(1, 15), new PlayerScore(0, 0));
        Round round_2 = new Round(new PlayerScore(1, 30), new PlayerScore(0, 0));
        Round round_3 = new Round(new PlayerScore(0, 30), new PlayerScore(1, 15));
        Round round_4 = new Round(new PlayerScore(1, 40), new PlayerScore(0, 15));
        Round round_5 = new Round(new PlayerScore(0, 40), new PlayerScore(1, 30));
        Round round_6 = new Round(new PlayerScore(0, 40), new PlayerScore(1, 40));
        Round round_7 = new Round(new PlayerScore(0, 0), new PlayerScore(1, 0));

        Game gameExpected = new Game();
        gameExpected.add(round_1);
        gameExpected.add(round_2);
        gameExpected.add(round_3);
        gameExpected.add(round_4);
        gameExpected.add(round_5);
        gameExpected.add(round_6);
        gameExpected.add(round_7);
        assertThat(game).isEqualTo(gameExpected);
    }

    @Test
    public void should_return_the_winner_player() {

        Round round1 = new Round(new PlayerScore(1));
        Round round2 = new Round(new PlayerScore(1));
        Round round3 = new Round(new PlayerScore(0));
        Round round4 = new Round(new PlayerScore(1));
        Round round5 = new Round(new PlayerScore(0));
        Round round6 = new Round(new PlayerScore(0));
        Round round7 = new Round(new PlayerScore(0));

        Game game = new Game();

        game.add(round1);
        game.add(round2);
        game.add(round3);
        game.add(round4);
        game.add(round5);
        game.add(round6);
        game.add(round7);

        game.calculateAllScores();

        String winner = game.getWinner();
        String winnerExpected = "Player2";

        assertThat(winner).isEqualTo(winnerExpected);
    }

}
