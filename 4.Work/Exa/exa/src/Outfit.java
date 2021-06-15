import java.util.Scanner;

public class Outfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cell = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        String shoes = null;
        String dress = null;

        if (cell >= 10 && cell <= 18) {

            if (day.equals("Morning")) {
                shoes = "Sneakers";
                dress = "Sweatshirt";
            } else if (day.equals("Afternoon")) {
                shoes = "Moccasins";
                dress = "Shirt";
            } else if (day.equals("Evening")) {
                shoes = "Moccasins";
                dress = "Shirt";
            }
        } else if (cell <= 24) {

            if (day.equals("Morning")) {
                shoes = "Moccasins";
                dress = "Shirt";
            } else if (day.equals("Afternoon")) {
                shoes = "Sandals";
                dress = "T-Shirt";
            } else if (day.equals("Evening")) {
                shoes = "Moccasins";
                dress = "Shirt";
            }
        } else if (cell > 24) {

            if (day.equals("Morning")) {
                shoes = "Sandals";
                dress = "T-Shirt";
            } else if (day.equals("Afternoon")) {
                shoes = "Barefoot";
                dress = "Swim Suit";
            } else if (day.equals("Evening")) {
                shoes = "Moccasins";
                dress = "Shirt";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",cell,dress,shoes);

    }
}