package Strings;

import java.util.Scanner;

public class sb_Reverse {
    public static void reverse(StringBuilder sb){
        int n = sb.length();int i = 0 , j = n-1;
        while (i <= j) {
            char a = sb.charAt(i);
            char b = sb.charAt(j);
            sb.setCharAt(i, b);
            sb.setCharAt(j, a);
            i++;j--;
        }System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        reverse(sb);
//        sb.reverse();

    }
}
