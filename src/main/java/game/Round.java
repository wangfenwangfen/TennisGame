package game;

class Round {
    private PlayerScore playerScore1;
    private PlayerScore playerScore2;

    Round() {
        this.playerScore1 = new PlayerScore();
        this.playerScore2 = new PlayerScore();
    }

    Round(PlayerScore playerScore1) {
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore1.playerOpponent();
    }

    Round(PlayerScore playerScore1, PlayerScore playerScore2) {
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore2;
    }

    PlayerScore getPlayerScore1() {
        return playerScore1;
    }

    PlayerScore getPlayerScore2() {
        return playerScore2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Round round = (Round) o;

        if (playerScore1 != null ? !playerScore1.equals(round.playerScore1) : round.playerScore1 != null) return false;
        return playerScore2 != null ? playerScore2.equals(round.playerScore2) : round.playerScore2 == null;
    }

    @Override
    public int hashCode() {
        int result = playerScore1 != null ? playerScore1.hashCode() : 0;
        result = 31 * result + (playerScore2 != null ? playerScore2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Round{" +
                "playerScore1=" + playerScore1 +
                ", playerScore2=" + playerScore2 +
                '}';
    }
}
