package game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    @Test
    public void score_should_be_0_when_point_is_0() {
        Player player = new Player(null);
        player.setTotalPoint(0);
        int resultScore = player.calculateScore();
        assertThat(resultScore).isEqualTo(0);
    }

    @Test
    public void score_should_be_15_when_point_is_1() {
        Player player = new Player(null);
        player.setTotalPoint(1);
        int resultScore = player.calculateScore();

        int expectedScore = 15;
        assertThat(resultScore).isEqualTo(expectedScore);
    }
    @Test
    public void score_should_be_30_when_point_is_2() {
        Player player = new Player(null);
        player.setTotalPoint(2);
        int resultScore = player.calculateScore();

        int expectedScore = 30;
        assertThat(resultScore).isEqualTo(expectedScore);
    }

    @Test
    public void score_should_be_40_when_point_is_3() {
        Player player = new Player(null);
        player.setTotalPoint(3);

        int resultScore = player.calculateScore();

        int expectedScore = 40;
        assertThat(resultScore).isEqualTo(expectedScore);
    }

    @Test
    public void player_is_Winner_should_be_true_when_point_is_4() {
        Player player = new Player(null);
        player.setTotalPoint(4);
        player.calculateScore();

       boolean result = player.isWinner();
       assertThat(result).isTrue();
    }

    @Test
    public void player_is_Winner_should_be_false_when_point_is_not_4() {
        Player player = new Player(null);
        player.setTotalPoint(1);
        player.calculateScore();

        boolean result = player.isWinner();
        assertThat(result).isFalse();
    }

    @Test
    public void should_initialize_the_last_score() {

        Player player = new Player(null);
        player.addScores(new Score(0, 0));
        player.addScores(new Score(1, 15));
        player.addScores(new Score(1, 30));
        player.addScores(new Score(1, 40));

       List <Score> scores = player.initLastScore();

        List<Score> scoresExpected = new ArrayList<Score>();
        scoresExpected.add(new Score(0, 0));
        scoresExpected.add(new Score(0, 0));
        scoresExpected.add(new Score(1, 15));
        scoresExpected.add(new Score(1, 30));
        scoresExpected.add(new Score(1, 0));

        assertThat(scores).isEqualTo(scoresExpected);
    }
}
