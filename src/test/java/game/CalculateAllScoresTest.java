package game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateAllScoresTest {

    @Test
    public void should_return_the_list_playercore_with_all_scores_calculated() {

        Player player = new Player(null);

        List<PlayerScore> playerScores = new ArrayList<PlayerScore>();

        playerScores.add(new PlayerScore(1));
        playerScores.add(new PlayerScore(1));
        playerScores.add(new PlayerScore(0));
        playerScores.add(new PlayerScore(1));
        playerScores.add(new PlayerScore(0));
        playerScores.add(new PlayerScore(0));
        playerScores.add(new PlayerScore(1));

        playerScores = player.calculateAllScores(playerScores);

        List<PlayerScore> scoresExpected = new ArrayList<PlayerScore>();
        scoresExpected.add(new PlayerScore(1, 15));
        scoresExpected.add(new PlayerScore(1, 30));
        scoresExpected.add(new PlayerScore(0, 30));
        scoresExpected.add(new PlayerScore(1, 40));
        scoresExpected.add(new PlayerScore(0, 40));
        scoresExpected.add(new PlayerScore(0, 40));
        scoresExpected.add(new PlayerScore(1, 0));

        assertThat(playerScores).isEqualTo(scoresExpected);
    }

    @Test
    public void should_return_the_right_score_for_the_player() {

        Player player1 = new Player("Player1");
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(1));

       List<PlayerScore> scoresResult = player1.getPlayerScores();

       List<PlayerScore> scoresExpected = new ArrayList<PlayerScore>();
       scoresExpected.add(new PlayerScore(0,0));
       scoresExpected.add(new PlayerScore(1, 15));
       scoresExpected.add(new PlayerScore(1, 30));
       scoresExpected.add(new PlayerScore(0, 30));
       scoresExpected.add(new PlayerScore(1, 40));
       scoresExpected.add(new PlayerScore(0, 40));
       scoresExpected.add(new PlayerScore(0, 40));
       scoresExpected.add(new PlayerScore(1, 0));

        assertThat(scoresResult).isEqualTo(scoresExpected);
    }
}
