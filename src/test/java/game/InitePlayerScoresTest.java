package game;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InitePlayerScoresTest {
    @Test
    public void should_init_last_element_of_playerScores() {

        Player player1 = new Player(null);
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(1));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(0));
        player1.addPlayerScore(new PlayerScore(0));
        player1.initLastPlayerScore();

        List<PlayerScore> list = player1.getPlayerScores();

        List<PlayerScore> scoresExpected = new ArrayList<PlayerScore>();
        scoresExpected.add(new PlayerScore(0, 0));
        scoresExpected.add(new PlayerScore(1, 15));
        scoresExpected.add(new PlayerScore(1, 30));
        scoresExpected.add(new PlayerScore(0, 30));
        scoresExpected.add(new PlayerScore(1, 40));
        scoresExpected.add(new PlayerScore(0, 40));
        scoresExpected.add(new PlayerScore(0, 40));
        scoresExpected.add(new PlayerScore(0, 0));

        assertThat(list).isEqualTo(scoresExpected);
    }
}
