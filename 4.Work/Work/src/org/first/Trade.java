package org.first;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Trade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        Double sells = Double.parseDouble(scanner.nextLine());
        double percent=0;

        if (town.equals("Sofia")) {
            if (sells >= 0 && sells <= 500) {
                percent = 0.05;
            } else if (sells<0){
                System.out.println("error");
                return;
            }
            else if (sells <= 1000) {
                percent = 0.07;
            } else if (sells <= 10000) {
                percent = 0.08;
            } else if (sells > 1000) {
                percent = 0.12;
            }
        } else if (town.equals("Varna")) {
            if (sells >= 0 && sells <= 500) {
                percent = 0.045;
            }
            else if (sells<0){
                System.out.println("error");
                return;
            }else if (sells <= 1000) {
                percent = 0.075;
            } else if (sells <= 10000) {
                percent = 0.1;
            } else if (sells > 1000) {
                percent = 0.13;
            }

        } else if (town.equals("Plovdiv")) {
            if (sells >= 0 && sells <= 500) {
                percent = 0.055;
            }
            else if (sells<0){
                System.out.println("error");
                return;
            }else if (sells <= 1000) {
                percent = 0.08;
            } else if (sells <= 10000) {
                percent = 0.12;
            } else if (sells > 1000) {
                percent = 0.145;
            }

        } else {
            System.out.println("error");
            return;
        }
        percent*= sells;
        System.out.printf("%.2f",percent);

    }

}