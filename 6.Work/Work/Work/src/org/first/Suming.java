package org.first;

import java.util.Scanner;

public class Suming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.next();
        int summ = 0;
        if (!comand.equals("Stop")) {
            int num = Integer.parseInt(comand);
            summ += num;
        }
        while (!comand.equals("Stop")) {
            comand = scanner.next();
            if (!comand.equals("Stop")) {
                int num = Integer.parseInt(comand);
                summ += num;
            }
        }
        System.out.println(summ);
    }
}
