package Recursion;

public class SumOfN {
    static int solve(int n){
        if(n == 0){
            return 0;
        }
        return n + solve(n - 1);
    }
    public static void main(String[] args) {
        int result = solve(10);
        System.out.println(result);
    }
}
