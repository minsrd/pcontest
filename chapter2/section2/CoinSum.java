package chapter2.section2;

import java.util.Scanner;

public class CoinSum {
    static int totalAmount;
    static int[] amount = {1, 5, 10, 50, 100, 500};
    static int[] coinNum = new int[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<6; i++){
            coinNum[i] = scanner.nextInt();
        }
        System.out.println("Total Amount:");
        totalAmount = scanner.nextInt();

        int ans = greedy();
        System.out.println("Number of coin use: " + ans);


    }

    private static int greedy(){
        int ans = 0;

        for(int i=5; i>=0; i--){
            // use as much as possible 
            int useCoinNum = Math.min(totalAmount/amount[i], coinNum[i]);
            totalAmount -= useCoinNum*amount[i];
            ans += useCoinNum;

        }
        return ans;

    }
    
}
