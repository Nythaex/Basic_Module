package org.first;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double len=Double.parseDouble(scan.nextLine());
        double wid=Double.parseDouble(scan.nextLine());
        double A=Double.parseDouble(scan.nextLine());

        double room=len*wid*10000;
        double something=A*A*10000;
        double bench=room/10;
        double roomwith=room-something-bench;
        double people=Math.floor(roomwith/7040);
        System.out.printf("%.0f",people);



    }
}
