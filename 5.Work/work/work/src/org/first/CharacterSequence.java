package org.first;

import javax.swing.*;
import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int a = word.length();

        for (int i = 0; i < a; i++) {
            System.out.println(word.charAt(i));
        }
    }
}
