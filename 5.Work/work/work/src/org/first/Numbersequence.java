package org.first;

import java.util.Scanner;

public class Numbersequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers=Integer.parseInt(scanner.nextLine());
        int max=-200000;
        int min=200000;

        for (int i=0;numbers>i;i++)
        {
            int num=Integer.parseInt(scanner.nextLine());
            if (num<min){
                min=num;

            }
            if (num>max){
                max=num;
            }
        }
        System.out.printf("Max number: %d",max);
        System.out.println();
        System.out.printf("Min number: %d",min);



    }
}
