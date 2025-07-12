package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.nextLine();

        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (isvowel(c) == true ) count++;
        }
        System.out.println(count);
    }

    public static boolean isvowel(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return true;
        return false;
    }
}
