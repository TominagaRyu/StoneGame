package StoneGame;

public class Player {
    String name;//プレイヤー名
    int wins;//勝ち数

    public Player(String name){
        this.name = name;
        this.wins = 0;
    }

    public void countUpWins(){
        wins++;
    }
}
