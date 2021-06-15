import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double apartment=0;
        double studio=0;
        if (season.equals("May")||season.equals("October")){
            studio=50;
            apartment=65;
            if (nights>14){
                studio-=studio*0.30;
                apartment-=apartment*0.1;
            }
            else if(nights>7){
                studio-=studio*0.05;
            }

        }
        else if (season.equals("June")||season.equals("September")){
            studio=75.20;
            apartment=68.70;
            if (nights>14){
                studio-=studio*0.2;
                apartment-=apartment*0.1;
            }


        }
        else if (season.equals("July")||season.equals("August")){
            studio=76;
            apartment=77;
            if (nights>14){
                apartment-=apartment*0.1;
            }


        }
        System.out.printf("Apartment: %.2f lv.",apartment*nights);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",studio*nights);

    }
}
