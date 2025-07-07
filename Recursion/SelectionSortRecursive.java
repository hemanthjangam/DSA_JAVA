package Recursion;

import java.util.Arrays;

public class SelectionSortRecursive {
    static void sort(int[] nums, int i, int j,int min, int n) {
        if(i == n - 1) return;
        if(i < n && j < n) {
            if(nums[j] < nums[min]) {
                min = j;
            }
            sort(nums, i, j + 1, min,  n);
        }else {
            swap(nums, i, min);
            sort(nums, i + 1, i + 2, i + 1, n);
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 5};
        sort(nums, 0, 1, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}