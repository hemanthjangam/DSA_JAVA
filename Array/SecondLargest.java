package Array;
import java.util.Scanner;

class SecondLargest {
    static int second_largest(int[] nums, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        // If no valid second largest found
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int result = second_largest(array, n);
        System.out.println(result);
        input.close();
    }
}