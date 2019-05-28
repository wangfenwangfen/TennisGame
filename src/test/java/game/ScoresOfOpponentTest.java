package game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ScoresOfOpponentTest {
    @Test
    public void should_return_the_right__list_of_playerScores_for_opponent() {
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
        player2.calculateAllScores();

        List<PlayerScore> listExpected = new ArrayList<PlayerScore>();
        listExpected.add(new PlayerScore(0, 0));

        listExpected.add(new PlayerScore(0, 0));
        listExpected.add(new PlayerScore(0, 0));
        listExpected.add(new PlayerScore(1, 15));
        listExpected.add(new PlayerScore(0, 15));
        listExpected.add(new PlayerScore(1, 30));
        listExpected.add(new PlayerScore(1, 40));
        listExpected.add(new PlayerScore(1, 0));

        assertThat(player2.getPlayerScores()).isEqualTo(listExpected);
    }
}
