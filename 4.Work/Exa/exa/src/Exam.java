import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int examhour=Integer.parseInt(scanner.nextLine());
        int exammin=Integer.parseInt(scanner.nextLine());
        int myhour=Integer.parseInt(scanner.nextLine());
        int mymin=Integer.parseInt(scanner.nextLine());

        int examall=examhour*60+exammin;
        int myall=myhour*60+mymin;
        int diff=Math.abs(examall-myall);
        int newhour=diff/60;
        int newmin=diff%60;

        if (myall>examall)
        {
            System.out.println("Late");
            if (newhour!=0){
                if (newmin<=10){
                    System.out.printf("%d:0%d hours after the start",newhour,newmin);
                }
                else {
                    System.out.printf("%d:%d hours after the start",newhour,newmin);
                }

            }else {
                System.out.printf("%d minutes after the start",newmin);
            }
        }
        else if(examall-30>myall){
            System.out.println("Early");
            if (newhour!=0){
                if (newmin<=10){
                    System.out.printf("%d:0%d hours before the start",newhour,newmin);
                }
                else {
                    System.out.printf("%d:%d hours before the start",newhour,newmin);
                }

            }else {
                System.out.printf("%d minutes before the start",newmin);
            }
        }
        else {
            System.out.println("On time");
            System.out.printf("%d minutes before the start",newmin);
        }


    }
}
