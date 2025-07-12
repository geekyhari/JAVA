package Game;
import java.util.Random;
import java.util.Scanner;
public class RPS3 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To the Game :-)");

        //game logic
        int u = 0,s = 0;
        for (int i = 0; i < 5; i++) {
            String[] st = {"Rock","Paper","Scissors"};
            int syc= rn.nextInt(2)+1;
            System.out.println("\nRound-"+(i+1));
            System.out.println("Enter Choice \n1-Rock \n2-Paper \n3-Scissors");
            int usc=sc.nextInt();
            if (usc < 1 || usc > 3) {
                System.out.println("Invalid choice! Please restart the game and choose 1, 2, or 3.");
                return;
            }
            System.out.println("You chose "+st[usc-1]);
            System.out.println("Computer chose "+st[syc-1]);
            if(usc==syc){
                System.out.println("It's a Draw!");
            }
            else if((usc==1 && syc == 2) ||(usc==2 && syc == 3) ||(usc==3 && syc == 1)) {
                System.out.println("You won!");
                u++;
            }
            else{
                System.out.println("You Lost!");
                s++;
            }
        }
        System.out.println("\n\nFinal Result:");
        if(u>s) System.out.print("Won :)");
        else System.out.print("Lost :(");
    }
}
