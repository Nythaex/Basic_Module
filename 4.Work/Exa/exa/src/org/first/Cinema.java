package org.first;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String type=scanner.nextLine();
        int red=Integer.parseInt(scanner.nextLine());
        int col=Integer.parseInt(scanner.nextLine());
        double all=red*col;

        if (type.equals("Premiere"))
        {
         all*=12;
        }
        else if(type.equals("Normal")){
            all*=7.5;

        }else if(type.equals("Discount")){

            all*=5;
        }
        System.out.printf("%.2f",all);
    }
}
