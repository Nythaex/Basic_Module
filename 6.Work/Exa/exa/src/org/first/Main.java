package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int allbooks =Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (count < allbooks) {
            String theBook = scanner.nextLine();

            if (theBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", count);
                return;
            }
            count++;
        }

        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", count);

    }
}
