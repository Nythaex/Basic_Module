package org.first;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int summ=1;
        while(summ<=num){
            System.out.println(summ);
            summ=(summ*2)+1;

        }
    }
}
