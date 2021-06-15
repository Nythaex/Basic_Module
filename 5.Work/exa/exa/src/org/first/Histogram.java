package org.first;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }

        }

        System.out.printf("%.2f",p1/numbers*100);
        System.out.println("%");
        System.out.printf("%.2f",p2/numbers*100);
        System.out.println("%");
        System.out.printf("%.2f",p3/numbers*100);
        System.out.println("%");
        System.out.printf("%.2f",p4/numbers*100);
        System.out.println("%");
        System.out.printf("%.2f",p5/numbers*100);
        System.out.println("%");

    }

}
