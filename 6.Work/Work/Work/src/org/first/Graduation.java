package org.first;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double summgrade = 0;
        int year = 1;

        while (year <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                summgrade += grade;
                year++;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f",name,summgrade/12);
    }
}
