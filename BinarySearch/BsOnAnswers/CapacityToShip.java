package BinarySearch.BSOnAnswers;

import java.util.Scanner;

// A conveyor belt has packages that must be shipped from one port to another within days days.
// The ith package on the conveyor belt has a weight of weights[i]. 
// Each day, we load the ship with packages on the conveyor belt (in the order given by weights). 
// We may not load more weight than the maximum weight capacity of the ship.
// Return the least weight capacity of the ship that will result in all the packages 
// on the conveyor belt being shipped within days days.

// Example 1:
// Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
// Output: 15
// Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
// 1st day: 1, 2, 3, 4, 5
// 2nd day: 6, 7
// 3rd day: 8
// 4th day: 9
// 5th day: 10

// Note that the cargo must be shipped in the order given, 

// Example 2:
// Input: weights = [3,2,2,4,1,4], days = 3
// Output: 6
// Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
// 1st day: 3, 2
// 2nd day: 2, 4
// 3rd day: 1, 4

// Example 3:
// Input: weights = [1,2,3,1,1], days = 4
// Output: 3
// Explanation:
// 1st day: 1
// 2nd day: 2
// 3rd day: 3
// 4th day: 1, 1

public class CapacityToShip {
    public static int calculate(int[] weights, int capacity) {
        int load = 0, days = 1;
        for(int i = 0; i < weights.length; i++) {
            if((load + weights[i]) <= capacity) {
                load += weights[i];
            }else {
                load = weights[i];
                days++;
            }
        }
        return days;
    }

    public static int minimumCapacity(int[] weights, int days) {
        int low = 0, high = 0;

        for(int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while(low <= high) {
            int mid = (low + high) / 2;

            int reqDays = calculate(weights, mid);

            if(reqDays == days) return mid;

            else if(reqDays <= days) {
                high = mid - 1;
            }else low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weights = new int[n];
        for(int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
        }
        int days = in.nextInt();
        in.close();
        int result = minimumCapacity(weights, days);
        System.out.println(result);
    }
}
