package Strings;

public class Stringbuilder {
    public static void main(String[] args) {
        String s = "abcdefgh";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
//        System.out.println(sb.length());
//        System.out.println(sb.capacity()); // by default the capacity is 16
//        System.out.println(sb.reverse());   // reverses the SB
//        sb.setCharAt(1,'a');

//        //Append
//        sb.append("xyz");
//        char[] ch = {'a','b','c'};
//        sb.append(ch);
//        int[] arr = {1,2,3};
//        sb.append(arr); // does not work , address is appended
//        System.out.println(sb);

//        //Delete
//        sb.deleteCharAt(3); // deletes character at index 3
//        System.out.println(sb);
//        sb.delete(1,5); // deletes characters from 1 to (5-1)
//        System.out.println(sb);

        //Insert
        sb.insert(2,'i');
        System.out.println(sb);
    }
}
