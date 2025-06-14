package Arrays.Arrays1D;
import java.util.Scanner;

public class ZerosToEnd {
    static void move_zeros(int[] nums, int n){
        int index = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        while(index < n){
            nums[index++] = 0;
        }
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        move_zeros(nums, n);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        in.close();
    }
}
