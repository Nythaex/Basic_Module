package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int summ=a+b+c;
        int min=summ/60;
        int sec=summ%60;
        if (sec<=9){
            System.out.printf("%d:0%d",min,sec);
        }
        else{
            System.out.printf("%d:%d",min,sec);
        }


    }
}
