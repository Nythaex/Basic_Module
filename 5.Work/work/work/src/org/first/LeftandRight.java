package org.first;

import java.util.Scanner;

public class LeftandRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;

        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            left += number;
        }
        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            right += number;
        }
        int diff = Math.abs(right - left);
        if (left==right){
            System.out.printf("Yes, sum = %d",left);
        }
        else {
            System.out.printf("No, diff = %d",diff);
        }
    }

}
