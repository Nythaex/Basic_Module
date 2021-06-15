package org.first;

import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double buget = Double.parseDouble(scanner.nextLine());
        int broi = Integer.parseInt(scanner.nextLine());
        double priceForOne = Double.parseDouble(scanner.nextLine());
        double price = broi * priceForOne;

        if (broi > 150) {
            price -= price * 0.1;
        }
        price+=buget*0.1;

        double nikito=Math.abs(buget-price);
        if (buget>=price){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",nikito);
        }
        else
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",nikito);
        }

    }
}
