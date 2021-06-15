package org.first;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int broi=Integer.parseInt(scan.nextLine());
        int sladkari=Integer.parseInt(scan.nextLine());
        int torti=Integer.parseInt(scan.nextLine());
        int gofreti=Integer.parseInt(scan.nextLine());
        int palachinki=Integer.parseInt(scan.nextLine());

        double all=(broi*(sladkari*((torti*45)+(gofreti*5.80)+(palachinki*3.20))));
        double yep=all/8;
        double everything=all-yep;
        System.out.printf("%.2f",everything);



    }
}
