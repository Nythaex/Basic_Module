package org.first;

import java.util.Scanner;

public class SummNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers=Integer.parseInt(scanner.nextLine());
        int summ=0;
        for (int i=0;i<numbers;i++){
            int num= (int) Double.parseDouble(scanner.nextLine());
            summ+=num;
        }
        System.out.println(summ);
    }
}
