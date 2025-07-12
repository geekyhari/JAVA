package Strings;

import java.util.Scanner;

public class InputStingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();       // method - 1
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(sc.nextLine()); // Method - 2
    }
}
