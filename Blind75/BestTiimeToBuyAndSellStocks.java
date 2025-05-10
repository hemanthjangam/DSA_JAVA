package Blind75;

import java.util.Scanner;

public class BestTiimeToBuyAndSellStocks {
    static int buySell(int[] nums){
        int profit = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int maxprofit = nums[j] - nums[i];
                if(maxprofit > profit){
                    profit = maxprofit;
                }
            }
        }
        // int min = nums[0];
        // int profit = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        //     profit = Math.max(profit, nums[i]-min);
        // }
        return profit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int result = buySell(nums);
        System.out.println(result);
        in.close();
    }
}