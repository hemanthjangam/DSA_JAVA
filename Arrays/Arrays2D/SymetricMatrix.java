package Array;

import java.util.Scanner;

public class SymetricMatrix {
    static boolean check(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; i < n; i++) {
                if(matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
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
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        boolean result = check(matrix, n);
        System.out.println(result);
    }
}
