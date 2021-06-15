import java.util.Scanner;

public class DRectangleArea {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x1=Double.parseDouble(scan.nextLine());
        double y1=Double.parseDouble(scan.nextLine());
        double x2=Double.parseDouble(scan.nextLine());
        double y2=Double.parseDouble(scan.nextLine());
        System.out.printf("%.2f",Math.abs((x1-x2)*(Math.abs(y1-y2))));
        System.out.println();
        System.out.printf("%.2f",2*(Math.abs(x1 - x2)+Math.abs(y1-y2)));
    }
}
