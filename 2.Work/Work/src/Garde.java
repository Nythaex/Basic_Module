import java.util.Scanner;

    public class Garde {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            double meters=Double.parseDouble(scan.nextLine());
            double price=meters*7.61;
            double diss=price*0.18;
            double fprice=price-diss;

            System.out.printf("The final price is: %.2f lv.",fprice);
            System.out.println();
            System.out.printf("The discount is: %.2f lv.",diss);



        }
    }


