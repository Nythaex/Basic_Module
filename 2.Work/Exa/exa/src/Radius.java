import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double rad=Double.parseDouble(scan.nextLine());
        System.out.printf("%.0f",rad* 180 / Math.PI);



    }
}
