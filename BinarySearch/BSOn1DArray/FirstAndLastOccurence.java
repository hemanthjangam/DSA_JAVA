package BinarySearch.BSOn1DArray;

import java.util.Scanner;

// Given an array of integers nums sorted in non-decreasing order, 
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]


public class FirstAndLastOccurence {

    static int first(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }else low = mid + 1;
        }

        return first;
    }

    static int last(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }else low = mid + 1;
        }

        return last;
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
        int f = first(nums, target);
        int l = last(nums, target);

        System.out.println(f + " " + l);
    }
}
