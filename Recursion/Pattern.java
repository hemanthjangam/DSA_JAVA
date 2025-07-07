package Recursion;

public class Pattern {
    public static void printPattern(int row, int col) {
        if(row == 0) return;
        if(col < row) {
            printPattern(row,  col + 1);
            System.out.print("*");
        }else {
            printPattern(row - 1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 0);
    }
}