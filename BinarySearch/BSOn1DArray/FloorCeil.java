package BinarySearch.BSOn1DArray;

import java.util.Scanner;

// You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

// Example 1:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
// Result: 4 7
// Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

// Example 2:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
// Result: 8 8
// Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.

public class FloorCeil {
    static int floor(int[] nums, int number) {
        int low = 0, high = nums.length - 1;
        int floor = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == number) return number;

            if(nums[mid] <= number) {
                floor = nums[mid];
                low = mid + 1;
            }else high = mid - 1;
        }

        return floor;
    }

    static int ceil(int[] nums, int number) {
        int low = 0, high = nums.length - 1;
        int ceil = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == number) return number;
            if(nums[mid] >= number) {
                ceil = nums[mid];
                high = mid - 1;
            }else low = mid + 1;
        }

        return ceil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        in.close();
        int f = floor(nums, target);
        int c = ceil(nums, target);

        System.out.println(f + " " + c);
    }
}
