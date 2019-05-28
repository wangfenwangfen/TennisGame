package game;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatePointsTotalTest {

    @Test
    public void should_return_0_if_point_is_0() {
        Player player = new Player("Player1");
        player.addPlayerScore(new PlayerScore(0));
        player.addPlayerScore(new PlayerScore(0));
        player.addPlayerScore(new PlayerScore(0));
        player.addPlayerScore(new PlayerScore(0));

        int result = player.calculatePointsTotal();

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void should_return_3_if_have_3_point() {
        Player player = new Player("Player1");
        player.addPlayerScore(new PlayerScore(0));
        player.addPlayerScore(new PlayerScore(1));
        player.addPlayerScore(new PlayerScore(1));
        player.addPlayerScore(new PlayerScore(0));
        player.addPlayerScore(new PlayerScore(1));

        int result = player.calculatePointsTotal();

        Assertions.assertThat(result).isEqualTo(3);
    }
}
