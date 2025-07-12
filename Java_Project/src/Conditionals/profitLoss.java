package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price = ");
        double cp=sc.nextDouble();
        System.out.print("Enter the selling price = ");
        double sp=sc.nextDouble();

        if (cp==sp)
            System.out.println("Neither profit nor loss");
        if (sp > cp)
            System.out.println("Profit of  Rs."+(sp-cp));
        if (sp < cp)
            System.out.println("Loss of  Rs."+(cp-sp));
    }
}
