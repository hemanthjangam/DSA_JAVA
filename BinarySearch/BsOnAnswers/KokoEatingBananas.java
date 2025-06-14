package BinarySearch.BsOnAnswers;

import java.util.Scanner;

// There are n piles of bananas, the ith pile has piles[i] bananas. 
// Koko can decide her bananas-per-hour eating speed of k. Each hour, 
// she chooses some pile of bananas and eats k bananas from that pile. 
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

// Example 1:
// Input: piles = [3,6,7,11], h = 8
// Output: 4

// Example 2:
// Input: piles = [30,11,23,4,20], h = 5
// Output: 30

// Example 3:
// Input: piles = [30,11,23,4,20], h = 6
// Output: 23

public class KokoEatingBananas {

    public static int hours(int[] piles, int bananas) {
        int hour = 0;
        for(int pile : piles) {
            hour += Math.ceil((double)pile / (double)bananas);
        }
        return hour;
    }

    public static int solution(int[] piles, int h) {
        int low = 0, high = 0;

        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while(low <= high) {
            int mid = (low + high) / 2;

            int time = hours(piles, mid);

            if(time <= h) {
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;

        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] piles = new int[n];
        for(int i = 0; i < n; i++) {
            piles[i] = in.nextInt();
        }
        int h = in.nextInt();
        in.close();

        int bananaperhour = solution(piles, h);
        System.out.println(bananaperhour);
    }
}
