package NotOut150.Matrix;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0},
            {4, 0, 6},
            {7, 8, 9}
        };
        // better approach
        /*
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        int rowlen = matrix.length;
        int collen = matrix[0].length;

        for(int i = 0 ; i < rowlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0 ; i < rowlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0 ; i < rowlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
         */

        //optimal approach
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        boolean rowhaszero = false;
        boolean colhaszero = false;
        for(int j = 0 ; j < collen ; j++){
            if(matrix[0][j] == 0){
                rowhaszero = true;
                break;
            }
        }
        for(int i = 0 ; i < rowlen ; i++){
            if(matrix[i][0] == 0){
                colhaszero = true;  
                break;
            }
        }

        for(int i = 1 ; i < rowlen ; i++){
            for(int j = 1 ; j < collen ; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1 ; i < rowlen ; i++){
            for(int j = 1 ; j < collen ; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(colhaszero){
            for(int i = 0 ; i < rowlen ; i++){
                matrix[i][0] = 0;
            }
        }
        if(rowhaszero){
            for(int j = 0 ; j < collen ; j++){
                matrix[0][j] = 0;
            }
        }

        //matrix printing
        for(int i = 0 ; i < rowlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
