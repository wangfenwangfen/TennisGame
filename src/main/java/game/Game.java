package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;

    Game() {
        players = new ArrayList<Player>();
    }

    List<Player> addPlayer(Player player) {
       players.add(player);
       return players;
    }

     Player getTheWinner() {
        Player winner = new Player(null);
       for(Player player : players){
           if(player.isWinner()){
               winner = player;
           }
       }
        return winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return players != null ? players.equals(game.players) : game.players == null;
    }

    @Override
    public int hashCode() {
        return players != null ? players.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                '}';
    }
}