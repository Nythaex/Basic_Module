package org.first;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=Integer.parseInt(scanner.nextLine());
        int x2=Integer.parseInt(scanner.nextLine());
        int x3=Integer.parseInt(scanner.nextLine());
        int all=x1*x2*x3;
        int summ=0;
        int need=0;
        String comand=scanner.next();
        if(!comand.equals("Done")){
            int boxes=Integer.parseInt(comand);
            summ+=boxes;
        }
        else {
            System.out.printf("%d Cubic meters left.",all);
            return;
        }
        while (!comand.equals("Done")){
            comand=scanner.next();
            if(!comand.equals("Done")){
                int boxes=Integer.parseInt(comand);
                summ+=boxes;
            }
            if (summ>all){
                 need=summ-all;
                System.out.printf("No more free space! You need %d Cubic meters more.",need);
                return;
            }
        }
        need=all-summ;
        System.out.printf("%d Cubic meters left.",need);

    }
}
