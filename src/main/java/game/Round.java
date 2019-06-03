package game;

class Round {
    private Player winner;

    Round(Player winner) {
        this.winner = winner;
    }

    boolean isWinnerOfRound(Player player){
        return player == winner;
    }
}
