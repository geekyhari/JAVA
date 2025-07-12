package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n= sc.nextInt();
        int a=1,d=2;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a*=d;
        }
        }
    }



