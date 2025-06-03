package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void merge(int[] nums, int low, int mid, int high){
       ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while(right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    static void mergeSort(int[] nums, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        in.close();
        mergeSort(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
    }
}
