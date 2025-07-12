package Strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int x = (int)ch;
            if (x>=65 && x<=90) {
                x+=32;
                ch = (char)x;
                str.setCharAt(i,ch);
            }
            else if (x>=97 && x<=122) {
                x-=32;
                ch = (char)x;
                str.setCharAt(i,ch);
            }
        }
        System.out.println(str);
    }
}
