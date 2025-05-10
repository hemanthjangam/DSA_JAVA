package Array;
import java.util.Scanner;

class RemoveDuplicates {
    static void remove_duplicates(int[] array, int n){
        int index = 1;
        for(int i = 1; i < n; i++){
            if(array[i] != array[i - 1]){
                array[index] = array[i];
                index++;
            }
        }
        for(int i = 0; i < index; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        input.close();
        remove_duplicates(array, n);
    }
    
}