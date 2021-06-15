package org.first;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double coin=Double.parseDouble(scanner.nextLine());
        coin=Math.floor(coin*100);
        int coins=0;

        while (coin !=0){
            if (coin>=200){
                coin-=200;
                coins+=1;
            }
            else if (coin>=100){
                coin-=100;
                coins+=1;
            }

            else if (coin>=50){
                coin-=50;
                coins+=1;
            }
            else if (coin>=20){
                coin-=20;
                coins+=1;
            }
            else if (coin>=10){
                coin-=10;
                coins+=1;
            }
            else if (coin>=5){
                coin-=5;
                coins+=1;
            }
            else if (coin>=2){
                coin-=2;
                coins+=1;
            }
            else if (coin>=1){
                coin-=1;
                coins+=1;
            }
        }
        System.out.println(coins);

    }
}
