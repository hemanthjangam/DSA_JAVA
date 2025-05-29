package Array;

import java.util.Arrays;
import java.util.Scanner;


public class RotateMatrix {

    static void rotate(int[][] matrix, int n){
        // Transpose matrix (row as columns and columns as row)
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){ //we skip unnecessary swaps by eleminating diagonals
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Now reverse every row
        for(int i = 0; i < n; i++){
            int start = 0, end = n-1;
            while(start <= end){
               int temp = matrix[i][start];
               matrix[i][start] = matrix[i][end];
               matrix[i][end] = temp;
               start++;
               end--;
            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();

        rotate(matrix, n);
    }
}
