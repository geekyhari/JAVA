package Game;
import java.util.Random;
import java.util.Scanner;
public class RPS2 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To the Game :-)");

        //game logic
        int u = 0,s = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int syc= rn.nextInt(2);
            System.out.println("Round-"+(i+1));
            System.out.println("Enter 0-Rock   1-Paper    2-Scissors");
            int usc=sc.nextInt();
//            System.out.println("You chose:");
            if (syc==0){ // system - Rock
                if(usc==0) {
                    System.out.println("Draw");
                }
                else if(usc==1) {
                    System.out.println("You Lost");
                    s++;
                }
                else if(usc==2) {
                    System.out.println("You Won");
                    u++;
                }
                System.out.println("User: "+u);
                System.out.println("System:"+s);
            }
            else if (syc==1){ // system - Paper
                if(usc==1) {
                    System.out.println("Draw");
                }
                else if(usc==0) {
                    System.out.println("You Lost");
                    s++;
                }
                else if(usc==2) {
                    System.out.println("You Won");
                    u++;
                }
                System.out.println("User: "+u);
                System.out.println("System:"+s);
            }
            else if (syc==2){ // system - Scissors
                if(usc==2) {
                    System.out.println("Draw");
                }
                else if(usc==1) {
                    System.out.println("You Lost");
                    s++;
                }
                else if(usc==0) {
                    System.out.println("You Won");
                    u++;
                }
                System.out.println("User: "+u);
                System.out.println("System:"+s);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Final Result:");
        if(u>s) System.out.print("Won :)");
        else System.out.print("Lost :(");
    }
}
