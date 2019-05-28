package game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddPlayerScoreTest {
    @Test
    public void should_return_the_right_score_when_add_playerScore() {

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
