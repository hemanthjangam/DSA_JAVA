package Arrays.Arrays2D;

import java.util.Scanner;

public class MtrixMultiplication {
    static void multiply(int[][] matrix1, int[][] matrix2, int n) {
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int temp = 0;
                for(int k = 0; k < n; k++) {
                    temp += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = temp;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }
        in.close();
        multiply(matrix1, matrix2, n);
    }
}
