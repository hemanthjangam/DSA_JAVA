package Recursion;

public class Pattern {
    public static void printPattern(int row, int col, int n) {
        if(row > n) return;
        if(col < row) {
            System.out.print("*");
            printPattern(row, col + 1, n);
        }else {
            System.out.println();
            printPattern(row + 1, 0, n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(1, 0, n);
    }
}