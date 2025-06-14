package BinarySearch;

import java.util.Scanner;

public class SearchRotatedSorted {
    public static int search(int[] nums, int low, int high, int target) {
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            // Left sort check
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                }else low = mid + 1;
            }
            // Right sort check
            else {
                if(nums[mid] <=  nums[high]) {
                    if(nums[mid] <= target && target <= nums[high]) {
                        low = mid + 1;
                    }else high = mid - 1;
                }
            }
        }

        return -1;
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
