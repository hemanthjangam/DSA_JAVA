package Arrays.Arrays2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    static void spiral(int[][] matrix, int m, int n){

        List<Integer> ans = new ArrayList<>();
        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while(top <= bottom && left <= right){
            
            // top line (left -> right)
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // right line (top -> bottom)
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            // bottom line (right -> left)
            for(int i = right; i >= left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;

            // left line (bottom -> top)
            for(int i = bottom; i >= top; i--){
                ans.add(matrix[i][left]);
            }
            left++;

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();

        spiral(matrix, m, n);
    }
}
