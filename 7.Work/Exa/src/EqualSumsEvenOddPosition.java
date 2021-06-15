import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int oddsum = 0;
        int evensum = 0;
        int charNum = 0;

        for (int i = first; i <=second; i++) {
            int changednum = i;
            oddsum=0;
            evensum=0;
            for (int a = 1; a <=6; a++) {
                charNum = changednum % 10;
                changednum /= 10;
                if(a%2==0){
                    evensum+=charNum;
                }
                else {
                    oddsum+=charNum;
                }
            }
            if (oddsum==evensum){
                System.out.print(i+" ");
            }
        }

    }
}
