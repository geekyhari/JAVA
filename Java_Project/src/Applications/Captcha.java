package Applications;

import java.util.Random;
import java.util.Scanner;

public class Captcha {

    static String gen(){
        Random rn = new Random();

        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int l = 6;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l + 1; i++) {
            int index = rn.nextInt(cap.length());
            sb.append(cap.charAt(index));
        }
        return sb.toString();
    }
    static String in(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s+"\nEnter the above Captcha:");
        return sc.nextLine();
    }
    public static void main(String[] args) {


        String s = gen();
        String c = in(s);
        while(true){
            if(s.equals(c)){
                System.out.println("Captcha Validated");
                break;
            }
            else{
                System.out.println("Captcha Wrogn\nRetry:");
                c = in(s);
            }
        }

    }
}
