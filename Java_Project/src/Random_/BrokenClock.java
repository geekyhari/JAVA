package Java_Project.src.Random_;

import java.util.Scanner;

public class BrokenClock {
    public static void clock(int n){
        int h=0,m=0;
        //String a = "AM";
        h=n/60;
        m=n%60;
        if(h>12) {
            System.out.println((h-12)+":"+m+" PM");
        } else if (h<12) {
            System.out.println(h+":"+m+" AM");
        }
        else System.out.println("12:"+m+" AM");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        clock(n);
    }
}
