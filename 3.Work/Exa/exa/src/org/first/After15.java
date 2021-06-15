package org.first;

import javafx.scene.control.skin.CellSkinBase;

import java.util.Scanner;

public class After15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int plus = min + 15;
        int newhour = hour + plus / 60;
        int newmin = plus % 60;
        if (newhour == 24) {
            newhour = 0;
        }

        if (newmin <= 9) {
            System.out.printf("%d:0%d", newhour, newmin);

        } else {
            System.out.printf("%d:%d", newhour, newmin);
        }


    }
}
