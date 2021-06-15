import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int numbers=Integer.parseInt(scanner.nextLine());
         int max=Integer.MIN_VALUE;
         int sum=0;
         for (int i=0;i<numbers;i++){
             int num=Integer.parseInt(scanner.nextLine());
             sum+=num;
             if(num>max){
                 max=num;
             }

         }

         int diff=Math.abs(max-sum);

         if(sum-max==max){
             System.out.println("Yes");
             System.out.printf("Sum = %d",max);
         }
         else {
             sum-=max;
             diff=Math.abs(max-sum);

             System.out.println("No");
             System.out.printf("Diff = %d",diff);
         }

    }
}
