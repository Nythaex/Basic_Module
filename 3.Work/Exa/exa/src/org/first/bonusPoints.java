package org.first;

import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (a <= 100) {
            bonus += 5;
        } else if (a > 100&&a<1000) {
            bonus += a * 0.2;
        } else {
            bonus += a * 0.1;
        }

        if (a % 2 == 0) {
            bonus += 1;
        } else if (a % 5 == 0) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(a+bonus);
    }

}

