package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.next();
	    while (!comand.equals("Stop")){
             comand = scanner.next();
        }

    }
}
