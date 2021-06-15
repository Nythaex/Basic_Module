package org.first;

import java.util.Scanner;

public class building {
    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          int stages=Integer.parseInt(scanner.nextLine());
        int roomsPerStage=Integer.parseInt(scanner.nextLine());


          for (int i=stages;i!=0;i--){
              for (int a=0;a<roomsPerStage;a++){
                  if (i==stages){
                      System.out.printf("L%d%d ",i,a);
                  }
                  else if (i%2==0){
                      System.out.printf("O%d%d ",i,a);
                  }else {
                      System.out.printf("A%d%d ",i,a);
                  }
              }System.out.println();
          }
    }
}
