package Random_;

import java.util.Scanner;

public class multi_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many multiples?");
        int n = sc.nextInt();
        for (int i = 1; i <= (n*5*7); i++) {
            if (i%5==0 && i%7 ==0) System.out.print(i+" ");
        }
    }
}
