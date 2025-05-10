package Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    static int[] sum(int[] nums, int target){
        //Bruteforce Approach TC = O(n^2) SC = O(1)
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

        //Using Hashmap TC = O(n), SC = O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int[] result = sum(nums, target);
        System.out.println(Arrays.toString(result));
        in.close();
    }
}