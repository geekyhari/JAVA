/* Anirudh and Harsh are back, and this time they’re dividing a pile of candies. They want to split the candies into two groups such that the difference between the two groups is exactly k. Write a program to determine if such a division is possible.

        Input Format:

        The first line contains an integer t (number of test cases).

        For each test case, there are two integers n (total candies) and k (required difference).

        Output Format:

        Print "YES" if the division is possible, otherwise print "NO".*/
package Java_Project.src.Random_;
import java.util.Scanner;
public class Candies {
    public static String candy(int n,int k){
        if(n%2==0){
            if(k==0) return "Yes";
            else if (k%2==0 && k<=n) {
                return "Yes";
            }
            else return "No";
        }
        else {
            if(k==0) return "Yes";
            if(k%2==0) return "No";
            else if (k<=n) {
                return "Yes";
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of test cases:");
        int t = sc.nextInt();
        int n,k;
        for (int i = 0; i < t; i++) {
            System.out.println("Enter n and k");
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(candy(n,k));
        }
    }
}
