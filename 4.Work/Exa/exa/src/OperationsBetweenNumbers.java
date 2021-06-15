import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String opp = scanner.nextLine();
        char op = opp.charAt(0);
        int summ = 0;
        double sumiiii = 0;
        if (op == '+') {
            summ = a + b;
            if (summ % 2 == 0) {
                System.out.printf("%d + %d = %d - even", a, b, summ);
            } else {
                System.out.printf("%d + %d = %d - odd", a, b, summ);
            }

        } else if (op == '-') {
            summ = a - b;
            if (summ % 2 == 0) {
                System.out.printf("%d - %d = %d - even", a, b, summ);
            } else {
                System.out.printf("%d - %d = %d - odd", a, b, summ);
            }

        } else if (op == '*') {
            summ = a * b;
            if (summ % 2 == 0) {
                System.out.printf("%d * %d = %d - even", a, b, summ);
            } else {
                System.out.printf("%d * %d = %d - odd", a, b, summ);
            }

        } else if (op == '/') {

            double aa = a;
            sumiiii = aa / b;
            if (b == 0) {
                System.out.printf("Cannot divide %d by zero", a);
                return;
            }
            System.out.printf("%.0f / %d = %.2f", aa, b, sumiiii);

        } else if (op == '%') {
            if (b == 0) {
                System.out.printf("Cannot divide %d by zero", a);
                return;
            }
            summ = a % b;

            System.out.print(a);
            System.out.print(" ");
            System.out.print("%");
            System.out.print(" ");
            System.out.print(b);
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            System.out.println(summ);


        }

    }

}

