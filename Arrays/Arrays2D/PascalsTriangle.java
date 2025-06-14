package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The goal is to achieve this output of pascals triangle by taking the input no.of rows

// for input 5
//      [1],
//     [1, 1],
//    [1, 2, 1],
//   [1, 3, 3, 1],
//  [1, 4, 6, 4, 1]

public class PascalsTriangle {
    static void pascalsTriangle(int rows){
        List<List<Integer>> result = new ArrayList<>();
        
        // Brute-force approach O(n^3) by using nCr function
        // for(int i = 0; i < rows; i++){
        //     List<Integer> row = new ArrayList<>();
        //     for(int j = 0; j <= i; j++){
        //         row.add(nCr(i, j));
        //     }
        //     result.add(row);
        // }

        // Optimal approach O(n^2) by using the modified method of nCr
        for(int row = 0; row < rows; row++){
            List<Integer> r = new ArrayList<>();
            long ans = 1;
            r.add((int)ans);
            for(int col = 1; col <= row; col++){
                ans = ans * (row - col + 1) / col;
                r.add((int)ans);
            }
            result.add(r);
        }

        System.out.println(result);
    }

    // static int nCr(int n, int c){
    //     long res = 1;
    //     for(int col = 0; col < c; col++){
    //         res = res * (n - col);
    //         res = res / (col + 1);
    //     }
    //     return (int) res;
    // }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        in.close();
        pascalsTriangle(rows);
    }
}
