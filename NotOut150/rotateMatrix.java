package NotOut150.Array_and_Hashing;
public class rotateMatrix {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and column of the(n x n) matrix:");
        int row = sc.nextInt();
        int column = row;
        */
        int row = 3;
        int column = row;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        /* 
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.printf("Enter the elements for %dst row %dth column:",i+1, j+1);
                int val = sc.nextInt();
                matrix[i][j] = val;
            }
        }
        sc.close();
        */
        System.out.println("Your matrix is:");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print( matrix[i][j] + " ") ;
            }
            System.out.println();
        }
    
        for(int i = 0 ; i < row-1 ; i++){
            for(int j = i+1 ; j < column ;j++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0 ;i < row ;i++){
            int left = 0;
            int right = matrix[i].length -1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Matrix after rotated 90 deg");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print( matrix[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}
/* bruteforce approach
 * package NotOut150;
import java.util.*;
public class rotateMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and column of the(n x n) matrix:");
        int row = sc.nextInt();
        int column = row;
        int matrix[][] = new int[row][column];

        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.printf("Enter the elements for %dst row %dth column:",i+1, j+1);
                int val = sc.nextInt();
                matrix[i][j] = val;
            }
        }
        sc.close();
        System.out.println("Your matrix is:");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print( matrix[i][j] + " ") ;
            }
            System.out.println();
        }
        int result [][] = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ;j++){
                result[j][(row-1)-i] = matrix[i][j];
            }
        }
        System.out.println("Matrix after rotated 90 deg");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print( result[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}
 */