package Strings;

public class equalsOperator {
    public static void main(String[] args) {
        String a = "abcdef";
        String b = "abc";
        b+="def";
        System.out.println(a==b); // checks the address of the whole string instead of checking each character
        System.out.println(a.equals(b)); // checks each character of the string and returns true/false
    }
}
