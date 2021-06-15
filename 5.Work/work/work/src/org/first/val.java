package org.first;

import java.util.Scanner;

public class val {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int a = word.length();
        int summ=0;
        for (int i=0;i<a;i++)
        {

            if (word.charAt(i)=='a'){
                summ+=1;
            }
            else if(word.charAt(i)=='e'){
                summ+=2;
            }
            else if(word.charAt(i)=='i'){
                summ+=3;
            }
            else if(word.charAt(i)=='o'){
                summ+=4;
            }
            else if(word.charAt(i)=='u'){
                summ+=5;
            }

        }
        System.out.println(summ);
    }
}
