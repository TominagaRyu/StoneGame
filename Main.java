package StoneGame;

public class Main {
    public static void main(String[] args){
        Player[] players = {new Player("A"),new Player("B")};
        StoneGame game = new StoneGame(players);
        game.start();
    }
}
