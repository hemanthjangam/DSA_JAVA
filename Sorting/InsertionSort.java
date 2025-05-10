package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void sort(int[] nums){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        in.close();
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
