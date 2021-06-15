import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        String FirstName=scan.nextLine();
        String SecondName=scan.nextLine();
        int age=Integer.parseInt(scan.nextLine());
        String town=scan.nextLine();

        System.out.printf("You are %s "+SecondName+", a %d-years old person from %s.",FirstName,age,town);



    }
}
