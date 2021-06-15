package org.first;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int fullSize = a * b;
        int peaces=0;


        while (fullSize >= 0) {
            String comand = scanner.nextLine();
            if (comand.equals("STOP")) {
                System.out.printf("%d pieces are left.",fullSize);
                return;
            }
            peaces=Integer.parseInt(comand);
            fullSize-=peaces;
        }
        System.out.printf("No more cake left! You need %d pieces more.",Math.abs(fullSize));


    }

}
