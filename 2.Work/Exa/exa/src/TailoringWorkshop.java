import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int broi=Integer.parseInt(scan.nextLine());
        double lenght=Double.parseDouble(scan.nextLine());
        double width=Double.parseDouble(scan.nextLine());

        double pokrivki=broi*((lenght+0.60)*(width+0.60));
        double kare=broi*(lenght/2)*(lenght/2);

        double USD=(pokrivki*7)+(kare*9);
        double BGN=USD*1.85 ;
        System.out.printf("%.2f USD",USD);
        System.out.println();
        System.out.printf("%.2f BGN",BGN);
        
    }
}
