package Random_;
import java.util.Scanner;
public class reverseNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int n = sc.nextInt();
        while(n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }
}
