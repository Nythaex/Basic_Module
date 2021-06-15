package org.first;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double summgrade = 0;
        int year = 1;
        int rip=0;

        while (year <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                summgrade += grade;
                year++;
            }
            else {
                rip++;
            }

            if (rip==2){
                System.out.printf("%s has been excluded at %d grade ",name,year);
                return;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, summgrade / 12);
    }
}

