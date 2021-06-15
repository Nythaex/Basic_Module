package org.first;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i=0;i<=num;i++){
            for (int a=0;a<=num;a++){
                for (int s=0;s<=num;s++){
                    if (i+a+s==num){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);


    }
}
