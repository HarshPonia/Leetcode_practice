package Top_Interview_150;
import java.util.*;
public class _54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;
        while(top<=bottom && left<= right){
            for(int i =left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i  = top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int  i = right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
