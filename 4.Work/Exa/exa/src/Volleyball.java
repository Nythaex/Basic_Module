import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String yesOrNot=scanner.nextLine();
        int events=Integer.parseInt(scanner.nextLine());
        int weekendsToMotherLand=Integer.parseInt(scanner.nextLine());

        double freeWeekends=(48-weekendsToMotherLand)*0.75;
        double freeEvents=events*(2d/3d);
        double all=freeEvents+freeWeekends+weekendsToMotherLand;

        if(yesOrNot.equals("leap")){
            all+=all*0.15;
        }
        System.out.printf("%.0f",Math.floor(all));


    }
}
