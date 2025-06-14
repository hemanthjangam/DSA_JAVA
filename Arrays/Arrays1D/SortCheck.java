package Arrays.Arrays1D;
import java.util.Scanner;

class SortCheck {
    static boolean check(int[] array, int n){
        for(int i = 1; i < n; i++){
            if(array[i] < array[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        boolean result = check(array, n);
        System.out.println(result);
        input.close();
    }
}
