package org.first;

import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thing = scanner.next();
        if (thing.equals("banana")
                || thing.equals("apple") || thing.equals("kiwi") || thing.equals("cherry") || thing.equals("lemon") || thing.equals("grapes")) {
            System.out.println("fruit");
        } else if (thing.equals("tomato")
                || thing.equals("cucumber") || thing.equals("pepper") || thing.equals("carrot")) {
            System.out.println("vegetable");
        } else{
            System.out.println("unknown");
        }
    }
}
