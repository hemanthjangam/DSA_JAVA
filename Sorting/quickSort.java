package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];

        int i = low;
        int j = high;

        while(i < j) {
            while(i <= high && nums[i] <= pivot) {
                i++;
            }

            while (j >= low && nums[j] > pivot) {
                j--;
            }

            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    static void quick_sort(int[] nums, int startIndex, int endIndex) {
        if(startIndex < endIndex) {
            int partitionIndex = partition(nums, startIndex, endIndex);
            quick_sort(nums, startIndex, partitionIndex - 1);
            quick_sort(nums, partitionIndex + 1, endIndex);
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
        quick_sort(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
    }
}
