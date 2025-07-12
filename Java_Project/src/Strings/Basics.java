package Strings;

import java.util.Locale;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
       // String str = sc.next(); // to take the entered string b4 space
        String str = sc.nextLine(); // to take the whole string
        System.out.print("Hi ");
        System.out.println(str);
        System.out.println(str.charAt(3)); // returns the char at index()
        System.out.println(str.length()); // returns length of str
        System.out.println(str.indexOf('a')); // returns the 1st index of a
        System.out.println(str.lastIndexOf('a')); // returns the 1st index of a
        System.out.println(str.contains("hri")); // returns true if str contains "hri" exists else false
        System.out.println(str.startsWith("shr")); //returns true if str starts with "shr" exists else false
        System.out.println(str.endsWith("ri")); //returns true if str ends with "ri" exists else false
        System.out.println(str.toLowerCase());
        str.toLowerCase(); //ntg will happen(useless)
        System.out.println(str.toUpperCase());

        //Concatenation
        String str1 = "Deshpande";
      //  System.out.println(str+str1); // M-1

      //  System.out.println(str.concat(str1));

        //Substring
        System.out.println(str1.substring(4)); // prints from 4 to end
        System.out.println(str1.substring(1,4)); // prints from 1 to (4-1)

        // '+' operator - String + int/char/string
        String s = str1;
        s = str1 + 10;
        s = str1 + 'a';
        s = str1 + " hii";
        System.out.println(s);
    }
}
