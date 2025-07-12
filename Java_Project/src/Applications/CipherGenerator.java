package Applications;

import java.util.Scanner;
class Cipher{
    private String mes;
    private int shift;

    public Cipher(String mes, int shift){
        this.mes = mes;
        this.shift = shift;
    }

    public String encrypt(){
        return transform(shift);
    }

    public String decrypt(){
        return mes;
    }

    private String transform(int sa){
        StringBuilder sb = new StringBuilder();

        for(char c : mes.toCharArray()){
            if(Character.isUpperCase(c)){
                char ch = (char)(((c - 'A'+ sa) % 26) + 'A');
                sb.append(ch);
            }
            else if(Character.isLowerCase(c)){
                char ch = (char)(((c - 'a'+ sa) % 26) + 'a');
                sb.append(ch);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

public class CipherGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cipher Generator\n");

        System.out.println("Enter Your Message: ");
        String mes = sc.nextLine();

        System.out.println("Enter the shift value:");
        int shift = sc.nextInt();

        Cipher ci = new Cipher(mes, shift);

        String encrypt = ci.encrypt();

        String decrypt = ci.decrypt();

        System.out.println("\nEncrypted Message:" + encrypt+"\nDecrypted Message:"+ decrypt);
    }
}
