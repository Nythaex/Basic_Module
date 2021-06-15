package org.first;

import java.util.Scanner;

public class LylyTheBoss {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int age=Integer.parseInt(scanner.nextLine());
        double cleaner=Double.parseDouble(scanner.nextLine());
        int toy=Integer.parseInt(scanner.nextLine());
        double money=0;
        double allmoney=0;
        int toys=0;

        for (int i=1;i<=age;i++){
            if (i%2==1){
                toys++;

            }
            else {
                money+=10;
                allmoney+=money;
                allmoney-=1;
            }
        }
        allmoney+=toy*toys;
        double diff=Math.abs(cleaner-allmoney);
        if (allmoney>=cleaner){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }


    }
}
