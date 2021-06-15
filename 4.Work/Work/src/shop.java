import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double broi =Double.parseDouble(scanner.nextLine());
        double price = 0;


        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        price = broi * 0.50;
                        break;
                    case "water":
                        price = broi * 0.80;
                        break;
                    case "beer":
                        price = broi * 1.20;
                        break;
                    case "sweets":
                        price = broi * 1.45;
                        break;
                    case "peanuts":
                        price = broi * 1.60;
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        price = broi * 0.45;
                        break;
                    case "water":
                        price = broi * 0.70;
                        break;
                    case "beer":
                        price = broi * 1.10;
                        break;
                    case "sweets":
                        price = broi * 1.35;
                        break;
                    case "peanuts":
                        price = broi * 1.55;
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        price = broi * 0.40;
                        break;
                    case "water":
                        price = broi * 0.70;
                        break;
                    case "beer":
                        price = broi * 1.15;
                        break;
                    case "sweets":
                        price = broi * 1.30;
                        break;
                    case "peanuts":
                        price = broi * 1.50;
                        break;
                }
                break;

        }
        System.out.println(price);
    }
}
