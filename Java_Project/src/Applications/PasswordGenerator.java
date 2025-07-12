package Applications;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;:,.<>?/";

        System.out.println("Password Generator");

        System.out.println("Enter the password Length");
        int length = sc.nextInt();
        sc.nextLine();
        if(length<1){
            System.out.println("Invalid length");
            return;
        }
        
        System.out.println("Uppercase? (y/n)");
        boolean useUpper = sc.nextLine().equalsIgnoreCase("y");

        System.out.println("Lowercase? (y/n)");
        boolean useLower = sc.nextLine().equalsIgnoreCase("y");

        System.out.println("Digits? (y/n)");
        boolean usedigits = sc.nextLine().equalsIgnoreCase("y");

        System.out.println("Symbols? (y/n)");
        boolean usesymb = sc.nextLine().equalsIgnoreCase("y");

        String charSet = "";
        if(useUpper) charSet += upper;
        if(useLower) charSet += lower;
        if(usedigits) charSet += digits;
        if(usesymb) charSet += symbols;

        if(charSet.isEmpty()){
            System.out.println("Error: You must select at least one character type.");
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rn.nextInt(charSet.length());
            password.append(charSet.charAt(index));
        }

        System.out.println("Generated Password: "+ password.toString());
    }
}
