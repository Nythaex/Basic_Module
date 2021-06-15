package org.first;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minnions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double summ = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minnions * 8.20 + trucks * 2;
        int broi = puzzles + dolls + bears + minnions + trucks;
        if (broi >= 50) {
            summ -= summ * 0.25;
        }
        summ -= summ * 0.10;
        double ILoveBoys = Math.abs(summ - tripPrice);

        if (summ >= tripPrice) {

            System.out.printf("Yes! %.2f lv left.", ILoveBoys);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", ILoveBoys);
        }
    }
}
