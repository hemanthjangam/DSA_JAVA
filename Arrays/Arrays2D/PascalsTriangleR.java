package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// You will be given the row of pascals triangle and you should return entire row


public class PascalsTriangleR {
    static void pascalRow(int row){
        List<Integer> result = new ArrayList<>();

        // This is a bruteforce approach O(n ^ 2) by using nCr formula for every element of the row
        // for(int i = 0; i <= row; i++){
        //     result.add(nCr(row, i));
        // }
        // System.out.println(result);


        // Optimal approach O(n) by keen observation that first col of every row is always 1 so
        // we take a value ans = 1 and if we observe [1, 4, 6, 4, 1] the next value is ans * (row - col + 1)/col

        long ans = 1;
        result.add((int)(ans));
        for(int col = 1; col <= row; col++){
            ans = ans * (row - col + 1) / col;
            result.add((int)(ans));
        }
        System.out.println(result);

    }

    // static int nCr(int r, int c){
    //     long res = 1;
    //     for(int i = 0; i < c; i++){
    //         res = res * (r - i);
    //         res = res / (i + 1);
    //     }
    //     return (int) res;
    // }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        in.close();
        pascalRow(row - 1);
    }
}
