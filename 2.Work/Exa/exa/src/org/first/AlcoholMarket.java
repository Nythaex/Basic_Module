package org.first;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double wiskiprice = Double.parseDouble(scan.nextLine());
        double beer = Double.parseDouble(scan.nextLine());
        double wine = Double.parseDouble(scan.nextLine());
        double rakia = Double.parseDouble(scan.nextLine());
        double wiski = Double.parseDouble(scan.nextLine());

        double rakiaprice = wiskiprice / 2;
        double wineprice = rakiaprice - rakiaprice * 0.4;
        double beerprice = rakiaprice - rakiaprice * 0.8;

        double all = wiskiprice * wiski + beerprice * beer + wineprice * wine + rakiaprice * rakia;
        System.out.printf("%.2f",all);

    }
}
