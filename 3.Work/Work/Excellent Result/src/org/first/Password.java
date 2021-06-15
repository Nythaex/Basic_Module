package org.first;


import java.util.Scanner;

import static java.lang.System.in;

public class Password {
    public static void main(String[] args) {

       Scanner scanner=new Scanner(in);
       String pass=scanner.nextLine();
       if (pass.equals("s3cr3t!P@ssw0rd"))
       {
           System.out.println("Welcome");
       }
       else {
           System.out.println("Wrong password!");
       }

    }
}
