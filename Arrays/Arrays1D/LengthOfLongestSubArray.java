package Arrays.Arrays1D;

import java.util.Scanner;

//      This is a java program for length of longest subarray with zero sum
// Example 1:
// Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
// Result: 5
// Explanation: The following subarrays sum to zero:
// {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
// Since we require the length of the longest subarray, our answer is 5!

// Example 2:
// Input Format: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}
// Result: 8
// Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
// Length of longest subarray = 8

public class LengthOfLongestSubArray {
    static void subarrayLength(int[] nums, int n){
        int max = 0;
        // Brute-force approach with time complexity n^2
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == 0){
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        in.close();

        subarrayLength(nums, n);
    }
}
