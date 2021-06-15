import java.util.Scanner;

public class GreetingbyName {
    public static void main(String[] args)
    {

        Scanner skener=new Scanner(System.in);
        String name=skener.nextLine();
        System.out.printf("Hello, %s!" ,name);


    }
}
