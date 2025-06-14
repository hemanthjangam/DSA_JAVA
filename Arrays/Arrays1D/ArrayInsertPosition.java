package Arrays.Arrays1D;

import java.util.Scanner;

public class ArrayInsertPosition {
    static void search(int[] nums, int k) {
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > k && nums[i - 1] < k) {
                index = i;
            }
        }
        if(k > nums[nums.length - 1]) index = nums.length;
        
        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        in.close();
        search(nums, k);
    }
}
