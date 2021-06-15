package org.first;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double time=Double.parseDouble(scanner.nextLine());
        if (time<=10){
            System.out.println("slow");
        }
        else if (time<=50)
        {
            System.out.println("average");
        }
        else if (time<=150)
        {
            System.out.println("fast");
        }
        else if (time<=1000)
        {
            System.out.println("ultra fast");
        }
        else
        {
            System.out.println("extremely fast");
        }

    }

}
