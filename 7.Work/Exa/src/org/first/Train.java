package org.first;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grades = Integer.parseInt(scanner.nextLine());
        double theGrade = 0;
        double finalasume=0;
        int projects=0;


        while (true) {
            String name = scanner.nextLine();
            if(name.equals("Finish")){
                break;
            }
            projects++;
            for (int i = grades; i != 0; i--) {
                double grade=Double.parseDouble(scanner.nextLine());
                theGrade += grade;
            }
            System.out.printf("%s - %.2f.", name, theGrade / grades);
            System.out.println();
            finalasume+=theGrade/grades;
            theGrade = 0;
        }
        System.out.printf("Student's final assessment is %.2f.",finalasume/projects);

    }

}
