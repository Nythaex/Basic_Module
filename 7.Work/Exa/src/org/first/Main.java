package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int i = 1; i <= num; i++) {
            for (int a = 1; a <= i; a++) {

                System.out.printf("%d ", counter);
                counter++;
                if(counter>num){
                    break;
                }
            }
            if(counter>num){
                break;
            }
            System.out.println();
        }


    }
}
