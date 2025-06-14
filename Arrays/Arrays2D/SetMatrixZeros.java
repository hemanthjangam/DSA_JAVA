package Arrays.Arrays2D;

//Given a matrix if an element in the nXn matrix is 0 then you will 
//have to set its entire column and row to 0 and then return the matrix.
public class SetMatrixZeros {
    public static void setZeros(int[][] matrix, int m, int n){
        int col0 = 1;

        // Step 1: Mark rows and columns
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Set matrix cells using markers
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set first row if needed
        if(matrix[0][0] == 0){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        // Step 4: Set first column if needed
        if(col0 == 0){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;
        setZeros(matrix, m, n);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
