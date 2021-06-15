package org.first;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.EventListener;
import java.util.OptionalDouble;
import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        double OddSum = 0;
        double OddMin = 2000000000;
        double OddMax = -2000000000;
        double EvenSum = 0;
        double EvenMin = 2000000000;
        double EvenMax = -2000000000;

        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 1) {
                double num = Double.parseDouble(scanner.nextLine());
                if (OddMax < num) {
                    OddMax = num;
                }
                if (OddMin > num) {
                    OddMin = num;
                }
                OddSum += num;
            } else {
                double num = Double.parseDouble(scanner.nextLine());
                if (EvenMax < num) {
                    EvenMax = num;
                }
                if (EvenMin > num) {
                    EvenMin = num;
                }
                EvenSum += num;
            }

        }
        System.out.printf("OddSum=%.2f,", OddSum);
        System.out.println();
        if (OddMin == 2000000000) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,", OddMin);
            System.out.println();
        }

        if (OddMax == -2000000000) {
            System.out.printf("OddMax=No,");
            System.out.println();
        } else {

            System.out.printf("OddMax=%.2f,", OddMax);
            System.out.println();
        }
        System.out.printf("EvenSum=%.2f,", EvenSum);
        System.out.println();
        if (EvenMin == 2000000000) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,", EvenMin);
            System.out.println();
        }

        if (EvenMax == -2000000000) {
            System.out.printf("EvenMax=No");
        } else {

            System.out.printf("EvenMax=%.2f", EvenMax);
        }
    }
}
