package BinarySearch.BSOn2DArray;

// Search for the targert in the given matrix by using binary search

import java.util.Scanner;

public class Search2DArray {
    public static boolean search(int[][] matrix, int target) {
        // Brute force approach O(m * (log n))
        // for(int i = 0; i < matrix.length; i++) {
        //     int low = 0, high = matrix[0].length;
        //     while(low <= high) {
        //         int mid = (low + high) / 2;

        //         if(matrix[i][mid] == target) return true;

        //         if(matrix[i][mid] <= target) {
        //             low = mid + 1;
        //         }else high = mid - 1;
        //     }
        // }

        // Optimal apprach O(log m * n)

        int low = 0, high = matrix.length * matrix[0].length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            int row = mid / matrix[0].length, col = mid % matrix[0].length;

            if(matrix[row][col] == target) return true;

            if(matrix[row][col] <= target) {
                low = mid + 1;
            }else high = mid - 1;

        }

        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int target = in.nextInt();

        in.close();
        boolean result = search(matrix, target);
        System.out.println(result);
    }
}
