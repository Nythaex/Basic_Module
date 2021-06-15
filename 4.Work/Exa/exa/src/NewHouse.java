import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int broi = Integer.parseInt(scanner.nextLine());
        double budged = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (type.equals("Roses")) {
            price = 5 * broi;
            if (broi > 80) {

                price -= price * 0.1;
            }
        } else if (type.equals("Dahlias")) {
            price = 3.8 * broi;
            if (broi > 90) {

                price -= price * 0.15;
            }
        } else if (type.equals("Tulips")) {
            price = 2.8 * broi;
            if (broi > 80) {

                price -= price * 0.15;
            }
        } else if (type.equals("Narcissus")) {
            price = 3 * broi;
            if (broi < 120) {

                price += price * 0.15;
            }
        } else if (type.equals("Gladiolus")) {
            price = 2.50 * broi;
            if (broi < 80) {

                price += price * 0.2;
            }
        }
        double diff = Math.abs(price - budged);
        if (budged >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", broi, type, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
