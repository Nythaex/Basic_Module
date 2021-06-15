package org.first;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VacationPrize = Double.parseDouble(scanner.nextLine());
        double moneyLeft = Double.parseDouble(scanner.nextLine());
        int daycount = 0;
        int spendedmoney = 0;
        double money =0;

        while (moneyLeft >=0) {
            String comand = scanner.nextLine();
             money = Double.parseDouble(scanner.nextLine());
            daycount++;
            if (comand.equals("save")) {
                spendedmoney = 0;
                moneyLeft += money;
            } else {
                moneyLeft -= money;
                spendedmoney += 1;
                if (moneyLeft <= 0) {
                    moneyLeft = 0;
                }
                if (spendedmoney==5){
                    break;
                }
            }

            if (moneyLeft >= VacationPrize) {
                System.out.printf("You saved the money for %d days.", daycount);
                return;
            }
        }
        System.out.println("You can't save the money.");
        System.out.println(daycount);
    }
}
