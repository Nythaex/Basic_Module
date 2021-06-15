package org.first;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allsteps = 10000;
        int steps = 0;

        while (allsteps > 0) ;
        {
            String comand = scanner.nextLine();
            steps = Integer.parseInt(comand);
            allsteps-=steps;
            if (comand.equals("Going home")) {
                steps = Integer.parseInt(scanner.nextLine());
                allsteps -= steps;
                if (allsteps <= 0) {
                    System.out.println("Goal reached! Good job!");
                } else {
                    System.out.printf("%d more steps to reach goal.", allsteps);
                }
            }
            steps = Integer.parseInt(comand);
            allsteps-=steps;
        }
        System.out.println("Goal reached! Good job!");
    }
}

