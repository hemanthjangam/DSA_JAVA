package Recursion;

import java.util.Arrays;

public class ArrayReverse {
    static void reverse(int[] nums, int start, int end){
        if(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            reverse(nums, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int nums[] = {5, 4, 3, 2, 1};
        reverse(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }
}
