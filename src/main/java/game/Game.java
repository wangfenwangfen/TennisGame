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
       initPlayerScoreForPlayers();
       return players;
    }

     Player winner() {
        Player winner = null;
       for(Player player : players){
           if(player.isWinner()){
               winner = player;
           }
       }
        return winner;
    }

    private void initPlayerScoreForPlayers(){
        if(isGameOver()){
            for(Player player : players){
                player.initLastPlayerScore();
            }
            }
        }

    private boolean isGameOver() {
        return winner()!=null;
    }

    List<Player> getPlayers() {
        return players;
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