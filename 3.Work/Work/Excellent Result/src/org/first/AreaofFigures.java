package org.first;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure=scanner.next();
        double result=0;

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.next());
             result = a * a;
            System.out.printf("%.3f", result);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.next());
            double b = Double.parseDouble(scanner.next());
             result = b * a;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(scanner.next());
             result = Math.PI * a*a;
            System.out.printf("%.3f", result);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.next());
            double b = Double.parseDouble(scanner.next());
             result =(a*b)/2;
                    System.out.printf("%.3f", result);
        }

    }
}
