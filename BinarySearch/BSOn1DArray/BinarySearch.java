package BinarySearch.BSOn1DArray;

import java.util.Scanner;
// nums ={1, 2, 3, 4, 5, 6, 7} 2
public class BinarySearch {
    public static int search(int[] nums, int low, int high, int target) {
        while(low < high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return - 1;
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
        int index = search(nums, 0, n - 1, target);
        System.out.println(index + 1);
    }
}
