package org.first;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int times=Integer.parseInt(scanner.nextLine());
        double summ=0;
        for (int a=1;a<=times;a++){
            double money=Double.parseDouble(scanner.nextLine());
            if(money<0)
            {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f",summ);
                return;
            }
            summ+=money;
            System.out.printf("Increase: %.2f",money);
            System.out.println();

        }

        System.out.printf("Total: %.2f",summ);


    }
}
