package Strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "shrihari";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(char x : arr) {
            System.out.print(x);
        }
        StringBuilder sb = new StringBuilder("Deshapande");
        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        for(char x : ch) {
            System.out.print(x);
        }
    }
}
