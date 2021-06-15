package org.first;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int broi = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {

            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }
        if (broi <= 6) {
            price -= price * 0.1;
        } else if (broi <= 11) {
            price -= price * 0.15;
        } else {
            price -= price * 0.25;
        }
        if (broi % 2 == 0 && !(season.equals("Autumn"))) {
            price -=price * 0.05;
        }

        double diff=Math.abs(price-budged);
        if (budged>=price){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }


    }
}
