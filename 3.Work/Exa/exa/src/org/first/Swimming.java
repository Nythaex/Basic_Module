package org.first;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Swimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double secform = Double.parseDouble(scanner.nextLine());
        double bonussec = Math.abs(Math.floor(m / 15) * 12.5);
        double time = secform * m + bonussec;
        if (record > time) {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            double nikola = time - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", nikola);
        }


    }
}
