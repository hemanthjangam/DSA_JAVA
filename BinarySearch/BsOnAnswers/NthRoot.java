package BinarySearch.BsOnAnswers;

import java.util.Scanner;

// The nth root of a number M is defined as a number X when raised to the power N equals M. 
// If the 'nth root is not an integer, return -1.

// Example 1:
// Input Format: N = 3, M = 27
// Result: 3
// Explanation: The cube root of 27 is equal to 3.

// Example 2:
// Input Format: N = 4, M = 69
// Result: -1
// Explanation: The 4th root of 69 does not exist. So, the answer is -1.

public class NthRoot {
    public static int search(int n, int m) {
        int low = 0, high = m;

        while(low <= high) {
            int mid = (low + high) / 2;
            double val = Math.pow(mid, n);
            if(val == m) return mid;

            if(val <= m) {
                low = mid + 1;
            }else high = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        int result = search(n, m);
        System.out.println(result);
    }
}
