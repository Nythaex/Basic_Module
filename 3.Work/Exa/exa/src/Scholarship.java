import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double grade = (Double.parseDouble(scanner.nextLine()));
        double min = (Double.parseDouble(scanner.next()));
        double miduspeh = (Math.floor(min * 0.35));
        double topuspeh = (Math.floor(grade * 25));

        if (grade >= 5.50) {
            if (topuspeh < miduspeh && dohod <= min) {
                System.out.printf("You get a Social scholarship %.0f BGN", (miduspeh));

            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", (topuspeh));
            }
        } else if (grade > 4.50 && dohod <= min) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(miduspeh));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
