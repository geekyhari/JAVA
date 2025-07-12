package Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int syc= rn.nextInt(2);
        System.out.println("Enter 0-Rock   1-Paper    2-Scissors");
        int usc=sc.nextInt();
        
        //game logic
        if (syc==0){ // system - Rock
            if(usc==0) System.out.println("Draw");
            else if(usc==1) System.out.println("You Lost");
            else if(usc==2) System.out.println("You Won");
        }
        else if (syc==1){ // system - Paper
            if(usc==1) System.out.println("Draw");
            else if(usc==0) System.out.println("You Lost");
            else if(usc==2) System.out.println("You Won");
        }
        else if (syc==2){ // system - Scissors
            if(usc==2) System.out.println("Draw");
            else if(usc==1) System.out.println("You Lost");
            else if(usc==0) System.out.println("You Won");
        }
    }
}
