package BinarySearch;

import java.util.Scanner;

// You are given a sorted array consisting of only integers where every element appears exactly twice, 
// except for one element which appears exactly once.
// Return the single element that appears only once.

// Example 1:
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

// Example 2:
// Input: nums = [3,3,7,7,10,11,11]
// Output: 10

public class SingleElement {

    static int single(int[] nums, int n) {

        if(n == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1, high = n - 2;

        while(low <= high) {
            int mid = (low + high) / 2;

            if((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1])) return  nums[mid];

            if(((mid % 2) == 0 && nums[mid + 1] == nums[mid]) || ((mid % 2 == 1) && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            }else high = mid - 1;
        }
        
        return - 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();

        int result = single(nums, n);
        System.out.println(result);
    }
}
