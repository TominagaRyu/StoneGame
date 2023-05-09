package StoneGame;

import oop.App;

import java.security.PrivateKey;
import java.util.Scanner;

public class StoneGame implements App{
    private Player[] players;
    private  int totalNumberOfStone = 25;
    private int numberOfStonesLeft;
    private int PlayerIndex;
    public StoneGame(Player[] players){
        this.players = players;
        this.numberOfStonesLeft = totalNumberOfStone;
        this.PlayerIndex = 0;
    }

    private boolean judgeEnd(){
        if(numberOfStonesLeft > 1){
            return false;
        }else{
            return true;
        }
    }

    public boolean next(){
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("石の数を入力してください：");
            input = scanner.nextInt();
        }while (checkInput(input));
        numberOfStonesLeft -= input;
        return judgeEnd();
    }

    private boolean checkInput(int input){
        if(input < 1 || input > 3){
            System.out.println("1～3の整数を入力してください");
            return true;
        }
        return false;
    }

    public void start(){
        System.out.println("石取りゲームを開始します。");
        boolean end = false;
        while(!end){
            end = next();
        }

        players[PlayerIndex].countUpWins();
        if(players[0].wins > players[1].wins){
            System.out.println(players[0].name + "が勝ちました。");
        }else if(players[0].wins < players[1].wins){
            System.out.println(players[1].name + "が勝ちました。");
        }else{
            System.out.println("引き分けです。");
        }

    }

}
