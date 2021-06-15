package org.first;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=20000000;
        int numbers=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=numbers;i++){
            int number=Integer.parseInt(scanner.nextLine());
            if(number<min){
                min=number;
            }

        }
        System.out.println(min);


    }
}
