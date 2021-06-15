package org.first;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int from=Integer.parseInt(scanner.nextLine());
        int to=Integer.parseInt(scanner.nextLine());
        int magical=Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i = from; i <= to; i++) {
            for (int a = from; a <= to; a++) {
                counter++;
                if (i+a==magical){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,a,a+i);
                    return;
                }

            }
        }
        System.out.printf("%d combinations - neither equals %d",counter,magical);

    }
}
