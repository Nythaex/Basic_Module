package org.first;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int rem = 0;
        int print = 0;


        for (int i = 1111; i < 9999; i++) {
            print = i;
            for (int a = 0; a <4; a++) {
                rem = print % 10;
                print /= 10;
                if(rem==0){
                    break;
                }
                if (num%rem != 0) {
                    break;
                }
                if (a==3){
                    System.out.print(i+" ");
                }
            }

        }
    }
}
