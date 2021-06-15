package org.first;

import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = (Integer.parseInt(scanner.nextLine()) - 1);
        String room = scanner.nextLine();
        String niki = scanner.nextLine();
        double price = 0;

        if (room.equals("room for one person")) {
            price = days * 18;


        } else if (room.equals("apartment")) {
            price = days * 25;
            if (days + 1 < 10) {
                price -= price * 0.3;
            } else if (days + 1 <= 15) {
                price -= price * 0.35;
            } else {
                price -= price * 0.5;
            }

        } else if (room.equals("president apartment")) {
            price = days * 35;
            if (days + 1 < 10) {
                price -= price * 0.1;
            } else if (days + 1 <= 15) {
                price -= price * 0.15;
            } else {
                price -= price * 0.2;
            }

        }
        if (niki.equals("positive"))
        {
            price+=price*0.25;
        }
        else if (niki.equals("negative"))
        {
            price-=price*0.1;
        }

        System.out.printf("%.2f",price);
    }

}
