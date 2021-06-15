package org.first;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            odd += number;
            i++;
            if (i >= numbers) {
                break;
            } else {
                number = Integer.parseInt(scanner.nextLine());
                even += number;
            }
        }
        int diff = Math.abs(even - odd);
        if (odd == even) {
            System.out.printf("Yes");
            System.out.println();
            System.out.printf("Sum = %d",odd);
        } else {
            System.out.printf("No");
            System.out.println();
            System.out.printf("Diff = %d",diff);
        }


    }
}
