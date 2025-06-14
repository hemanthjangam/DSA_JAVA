package BinarySearch.BSOn1DArray;

import java.util.Scanner;

public class UpperBound {
    public static int search(int[] nums, int low, int high, int target) {
        int index = nums.length;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target) {
                index = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        int result = search(nums, 0, n - 1, target);
        System.out.println(result);
    }
}
