package Advance;

import java.util.Scanner;

public class Try_with_resources {
    public static void main(String[] args) {
        int num = 0;
        try(Scanner sc = new Scanner(System.in)){       //it automatically closes as soon as the try block is executed
            num = sc.nextInt();
        }
    }
}
