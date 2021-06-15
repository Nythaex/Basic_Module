package org.first;

import java.net.Inet4Address;
import java.util.Scanner;

public class Number1to9toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int a = Integer.parseInt(text);
        char theOne = 'd';


        for (int i = 0; i < text.length(); i++) {
            if (i >= 1) {
                System.out.print("-");
                ;
            }
            theOne = text.charAt(i);


            if (theOne == '1') {

                System.out.print("one");
            } else if (theOne == '2') {

                System.out.print("two");
            } else if (theOne == '3') {

                System.out.print("three");
            } else if (theOne == '4') {

                System.out.print("four");
            } else if (theOne == '5') {

                System.out.print("five");
            } else if (theOne == '6') {

                System.out.print("six");
            } else if (theOne == '7') {

                System.out.print("seven");
            } else if (theOne == '8') {

                System.out.print("eight");
            } else if (theOne == '9') {

                System.out.print("nine");
            } else if (theOne == '0') {
                System.out.print("zero");
            }

        }
        System.out.println();
        System.out.println("Искам да умра.Животът ми е пълен провал.Вече правих опит за самоубийство,но ме спасиха.Трудно ми е да се справям с живота.Някой може ли да ми помогне?Защо единствено моето име завършва на 'а'?И съм грозен (точка :D)");
    }

}


