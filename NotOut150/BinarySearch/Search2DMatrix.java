/*
 * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
 */
package NotOut150.BinarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 4, 8},
            {10, 11, 12, 13},
            {14, 20, 30, 40}
        };
        int target = 10;

        boolean found = searchMatrix(matrix, target);
        System.out.println(found);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int xcor = mid / col; //row index
            int ycor = mid % col; // col index

            if (matrix[xcor][ycor] == target) {
                return true;
            } else if (matrix[xcor][ycor] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

