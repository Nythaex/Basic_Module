import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vis=Integer.parseInt(scan.nextLine());
        int dyl=Integer.parseInt(scan.nextLine());
        int shir=Integer.parseInt(scan.nextLine());
        double percent=Double.parseDouble(scan.nextLine());
        double all=vis*dyl*shir;
        double newp=percent*0.01;
        double full=(all-all*newp)*0.001;

        System.out.printf("%.3f",full);




    }
}
