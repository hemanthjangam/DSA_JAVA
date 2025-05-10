package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void sort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
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
