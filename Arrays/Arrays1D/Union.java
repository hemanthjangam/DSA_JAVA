package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Union {
    static void union(int[] nums1, int[] nums2){
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        for(int i = 0; i < nums1.length; i++){
            nums[i] = nums1[i];
        }
        int s = nums1.length;
        for(int i = 0;i < nums2.length; i++){
            nums[s+i] = nums2[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int[] nums1 = new int[s1];
        for(int i = 0; i < s1; i++){
            nums1[i] = in.nextInt();
        }
        int s2 = in.nextInt();
        int[] nums2 = new int[s2];
        for(int i = 0; i < s2; i++){
            nums2[i] = in.nextInt();
        }
        union(nums1, nums2);
        in.close();
    }  
}
