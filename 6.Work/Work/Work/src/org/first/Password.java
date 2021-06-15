package org.first;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String pass=scanner.nextLine();
        String trying=scanner.next();
        while (!pass.equals(trying))
        {
            trying=scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name);
    }
}
