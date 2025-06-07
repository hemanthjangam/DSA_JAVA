package Recursion;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int search(int[] nums, int low, int high, int target) {
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return search(nums, low, mid - 1, target);
        else return search(nums, mid + 1, high, target);
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
        int result = search(nums, 0, n - 1, target) + 1;
        System.out.println(result);
    }
}
