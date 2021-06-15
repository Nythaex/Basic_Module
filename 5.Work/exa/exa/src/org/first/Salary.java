package org.first;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs=Integer.parseInt(scanner.nextLine());
        int salary=Integer.parseInt(scanner.nextLine());

        while (tabs!=0) {
            String name = scanner.nextLine();
            tabs--;
            if (name .equals("Facebook")) {
                salary -= 150;
            } else if (name.equals("Instagram")) {
                salary -= 100;
            } else if (name.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary);

    }
}
