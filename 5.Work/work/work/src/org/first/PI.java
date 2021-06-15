package org.first;

import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());

        for (int i=0;i<=a;i+=2){
            System.out.println((int)(Math.pow(2,i)));
        }

    }
}
