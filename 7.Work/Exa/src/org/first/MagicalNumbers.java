package org.first;

import java.util.Scanner;

public class MagicalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int magicSum=0;
        int noneMagicSum=0;

        while (true) {
            String comand=scanner.nextLine();
            if (comand.equals("stop")){
                break;
            }
            int num = Integer.parseInt(comand);
            counter = 0;
            if (num < 0) {
                System.out.println("Number is negative.");
                continue;
            } else {
                for (int a = 1; a <= num; a++) {
                    if (num%a==0){
                        counter++;
                    }
                }
            }
            if (counter>2){
                magicSum+=num;
            }
            else {
                noneMagicSum+=num;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d",noneMagicSum);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d",magicSum);

    }
}
