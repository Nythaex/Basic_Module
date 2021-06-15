package org.first;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double slots = Double.parseDouble(scanner.nextLine());
        double delete=slots;
        String bilets = "null";
        double kid = 0;
        double standard = 0;
        double student = 0;
        double full = 0;
        double allkid = 0;
        double allstandard = 0;
        double allstudent = 0;

        while (!name.equals("Finish")) {
            while (!bilets.equals("End") && (slots > 0)) {
                bilets = scanner.nextLine();
                if (bilets.equals("kid")) {
                    kid++;
                    full++;
                    slots--;
                }
                if (bilets.equals("standard")) {
                    standard++;
                    full++;
                    slots--;
                }
                if (bilets.equals("student")) {
                    student++;
                    full++;
                    slots--;
                }
            }
            System.out.printf("%s - %.2f", name, full / delete * 100);
            System.out.println("% full.");
            allkid += kid;
            allstandard += standard;
             allstudent +=student;
            kid = 0;
            standard = 0;
            student = 0;
            full = 0;
            bilets = "null";
            name = scanner.nextLine();
            if (!name.equals("Finish")) {
                slots = Double.parseDouble(scanner.next());
                delete=slots;
            }
        }
        System.out.printf("Total tickets: %.0f",allkid+allstandard+allstudent);
        System.out.println();
        System.out.printf("%.2f",(allstudent/(allkid+allstandard+allstudent))*100);
        System.out.println("% student tickets.");
        System.out.printf("%.2f",(allstandard/(allkid+allstandard+allstudent))*100);
        System.out.println("% standard tickets.");
        System.out.printf("%.2f",(allkid/(allkid+allstandard+allstudent))*100);
        System.out.println("% kids tickets.");

    }


}
