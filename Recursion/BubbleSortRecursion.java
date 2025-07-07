package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    static void sort(int[] nums, int i, int n) {
        if(n == 0) return;
        if(i < n) {
            if(nums[i] > nums[i + 1]) {
                swap(nums, i, i + 1);
            }
            sort(nums, i + 1, n);
        }else {
            sort(nums, 0, n - 1);
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 1};
        sort(nums,0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
