/*                                  (0,3)
                    (0,0)            ↓ Right
                    ┌────┬────┬────┬────┐
               → top│ 1  │ 2  │ 3  │ 4  │
                    ├────┼────┼────┼────┤
                    │ 5  │ 6  │ 7  │ 8  │
                    ├────┼────┼────┼────┤     
                    │ 9  │10  │11  │12  │
                    ├────┼────┼────┼────┤
                    │13  │14  │15  │16  │<- Bottom
                    └────┴────┴────┴────┘
                    ↑ Left   
                    (3,0)          (3,3)
*/
package NotOut150.Matrix;

import java.util.*;
public class SpiralPrint{
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {20, 13, 14, 15, 16}
                      };

        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = row-1;
        int bottom = col-1;

        while(top <= bottom && left <= right){
            for(int i = top ; i <= right ; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }


        for(int i = 0 ; i < result.size() ; i++){
            System.out.print(result.get(i) + " ");
        }
    }
}