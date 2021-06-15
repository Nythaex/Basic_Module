package org.first;

import java.util.Scanner;

public class Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int badGradesCount = 0;
        double averageGrade = 0;
        int gradeCount = 0;
        String  lastProblem=null;

        while (true) {
            String problemName = scanner.nextLine();

            if (problemName.equals("Enough")){
                System.out.printf("Average score: %.2f",averageGrade/gradeCount);
                System.out.println();
                System.out.printf("Number of problems: %d",gradeCount);
                System.out.println();
                System.out.printf("Last problem: %s",lastProblem);
                return;
            }
             lastProblem=problemName;
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <= 4) {
                badGradesCount++;
                if (badGrades==badGradesCount){
                    System.out.printf("You need a break, %d poor grades.",badGradesCount);
                    return;
                }
            }
            gradeCount++;
            averageGrade+=grade;
        }


    }
}
