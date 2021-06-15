package org.first;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String now = scanner.nextLine();
        String after = scanner.nextLine();

        if (now.equals("mm")) {
            if (after.equals("m")) {
                a /= 1000;
            } else if (after.equals("cm")) {
                a /= 10;
            }

        }
        else if (now.equals("cm")) {
            if (after.equals("m")) {
                a /= 100;
            } else if (after.equals("mm")) {
                a *= 10;
            }

        }
        else if (now.equals("m")) {
            if (after.equals("cm")) {
                a *= 100;
            } else if (after.equals("mm")) {
                a *= 1000;
            }

        }
        System.out.printf("%.3f",a);
    }
}