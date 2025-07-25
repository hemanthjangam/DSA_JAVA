package BinarySearch.BSOn2DArray;

import java.util.Scanner;

// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
// This matrix has the following properties:
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

// Input: 
//        matrix = [[ 1,  4,  7, 11, 15],
//                  [ 2,  5,  8, 12, 19],
//                  [ 3,  6,  9, 16, 22],
//                  [10, 13, 14, 17, 24],
//                  [18, 21, 23, 26, 30]], 
//         target = 5
// Output: true

public class Search2DArrayII {

    public static boolean search(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) return true;

            if(matrix[row][col] <= target) {
                row++;
            }else col --;
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
