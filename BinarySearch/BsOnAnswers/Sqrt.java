package BinarySearch.BsOnAnswers;

import java.util.Scanner;

public class Sqrt {
    public static void search(int n) {
        int low = 1, high = n;
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if(val <= (long)(n)) {
                ans = (int) mid;
                low = (int)(mid + 1);
            }else high = (int)(mid - 1);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        search(n);
    }
}
