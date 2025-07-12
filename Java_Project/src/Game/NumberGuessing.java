package Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int sy = rn.nextInt(100)+1;
        System.out.println("Welcome \n I have chosen a number. \n Your turn!");
        int n = 0,ct=0;
        while(sy!=n){
            System.out.println("Enter the number between 1-100:");
            n = sc.nextInt();
            if(n<=100 && n>0){
                ct++;
                if(n<sy) {
                    System.out.println("Low");
                }
                else if(n>sy) {
                    System.out.println("High");
                }
                else {
                    System.out.println("Congratulations !! You have chosen the number in "+ct+" attempts");
                }
            }
            else System.out.println("Invalid number \nEnter numbers in range 1-100");
        }
    }
}
