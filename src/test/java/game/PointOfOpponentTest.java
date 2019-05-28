package game;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PointOfOpponentTest {
    @Test
    public void point_of_opponent_should_be_0_if_player_point_is_1() {
        PlayerScore playerScore = new PlayerScore(1);
        PlayerScore playerScoreOpponent = playerScore.pointOfOpponent();

        PlayerScore playerScoreExpected = new PlayerScore(0);

        Assertions.assertThat(playerScoreOpponent).isEqualTo(playerScoreExpected);
    }

    @Test
    public void point_of_opponent_should_be_1_if_player_point_is_0() {
        PlayerScore playerScore = new PlayerScore(0);
        PlayerScore playerScoreOpponent = playerScore.pointOfOpponent();

        PlayerScore playerScoreExpected = new PlayerScore(1);

        Assertions.assertThat(playerScoreOpponent).isEqualTo(playerScoreExpected);
    }
}
