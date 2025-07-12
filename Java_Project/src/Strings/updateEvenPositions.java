package Strings;

public class updateEvenPositions {
    public static void main(String[] args) {
        String str = "Shrihari";
        int n = str.length();

        String s = "";
        for (int i = 0; i < n; i++) {
            if (i%2 != 0) s+=str.charAt(i);
            else s += 'a';
        }
        System.out.println(s);
    }
}
