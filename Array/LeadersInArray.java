package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    static void leader(int[] nums, int n){
        ArrayList<Integer> ans = new ArrayList<>();

        // Brute-force approach
        // for(int i = 0; i < n; i++){
        //     boolean flag = true;
        //     for(int j = i + 1; j < n; j++){
        //         if(nums[j] > nums[i]){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag) ans.add(nums[i]);
        // }

        // Optimal approach
        int max = nums[n - 1];
        ans.add(nums[n - 1]);
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        in.close();

        leader(nums, n);
    }
}
