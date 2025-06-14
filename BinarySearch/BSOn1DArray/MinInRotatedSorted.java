package BinarySearch.BSOn1DArray;

import java.util.Scanner;

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// Example 1:
// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.

// Example 2:
// Input: nums = [4,5,6,7,0,1,2]
// Output: 0
// Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

// Example 3:
// Input: nums = [11,13,15,17]
// Output: 11
// Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 

public class MinInRotatedSorted {

    static void minimum(int[] nums, int n) {
        int low = 0, high = n - 1;
        int min = Integer.MAX_VALUE;    
        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();

        minimum(nums, n);
    }
}
