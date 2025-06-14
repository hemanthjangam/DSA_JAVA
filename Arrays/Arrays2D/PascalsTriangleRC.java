package Arrays.Arrays2D;

import java.util.Scanner;


// You will be given position of the value that is [row][col] you should return the value of that position from the triangle

//      [1],
//     [1, 1],
//    [1, 2, 1],
//   [1, 3, 3, 1],
//  [1, 4, 6, 4, 1]

// if the input is row = 3 and col = 2 return 2 -> pascalTriagle[2][1]

// Here we are using the simplified formula of r! / c! * (r - c)! 
// we onlly take c places of r that is for 4C2 we take 4x3/1x2 that is [4][2] 4

public class PascalsTriangleRC {

    static void nCr(int r, int c){
        int res = 1;
        for(int i = 0; i < c; i++){
            res = res * (r - i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        in.close();
        nCr(row - 1, col - 1);
    }
}
