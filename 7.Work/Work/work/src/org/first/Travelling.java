package org.first;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String country=scanner.nextLine();

        while (!country.equals("End")){
            double price=Double.parseDouble(scanner.nextLine());
            double saving=0;
            while (price>saving){
                double money=Double.parseDouble(scanner.nextLine());
                saving=saving+money;
            }
            System.out.printf("Going to %s!%n",country);
            country=scanner.nextLine();

        }
    }
}
