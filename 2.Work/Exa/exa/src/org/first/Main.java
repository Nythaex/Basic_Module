package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double lev=Double.parseDouble(scan.nextLine());
        double dolar=lev*1.79549 ;
        System.out.printf("%.2f", lev*1.79549);


    }
}
