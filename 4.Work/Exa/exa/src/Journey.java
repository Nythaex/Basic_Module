import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = null;
        String type = null;
        double price = 0;

        if (budged <= 100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                type = "Camp";
                price = budged * 0.3;
            } else if (season.equals("winter")) {
                type = "Hotel";
                price = budged * 0.7;
            }
        } else if (budged <= 1000) {
            country = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                price = budged * 0.4;
            } else if (season.equals("winter")) {
                type = "Hotel";
                price = budged * 0.8;
            }
        } else {
            country = "Europe";
            type = "Hotel";
            price = budged * 0.9;
        }
        System.out.printf("Somewhere in %s",country);
        System.out.println();
        System.out.printf("%s - %.2f",type,price);
    }
}
