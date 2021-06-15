package org.first;

import java.util.Scanner;

public class Numbers1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 1; a >=i+3; i+=3) {

            System.out.println(i);


        }

    }
}
