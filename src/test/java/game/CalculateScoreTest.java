package game;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculateScoreTest {
    @Test
    public void gameScore_should_be_0_when_point_is_0() {
       Player player = new Player("Player1");
        int resultScore = player.calculateScore(0);
        Assertions.assertThat(resultScore).isEqualTo(0);
    }

    @Test
    public void gameScore_should_be_15_when_point_is_1() {
        int point = 1;
        Player player = new Player("Player1");
        int resultScore = player.calculateScore(point);
        int expectedScore = 15;
        Assertions.assertThat(resultScore).isEqualTo(expectedScore);
    }
    @Test
    public void gameScore_should_be_30_when_point_is_2() {
        int point = 2;
        Player player = new Player("Player1");
        int resultScore = player.calculateScore(point);
        int expectedScore = 30;
        Assertions.assertThat(resultScore).isEqualTo(expectedScore);
    }

    @Test
    public void gameScore_should_be_40_when_point_is_3() {
        int point = 3;
        Player player = new Player("Player1");
        int resultScore = player.calculateScore(point);
        int expectedScore = 40;
        Assertions.assertThat(resultScore).isEqualTo(expectedScore);
    }

    @Test
    public void playerScore_should_be_0_when_point_is_4() {
        int point = 4;
        Player player = new Player("Player1");
        int resultScore = player.calculateScore(point);
        int expectedScore = 0;
        Assertions.assertThat(resultScore).isEqualTo(expectedScore);
    }

}
