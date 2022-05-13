import java.util.ArrayList;

public class Matrix {

    /*
    Create a Matrix class. In Matrix create the minimum and the numbersDivisibleByThree methods.
    Both method has to process a 2-dimensional integer matrix:
    first one has to define the minimum of the matrix,
    other one has to collect the numbers divisible by 3.
     */

    public static int[] minimum(int[][] matrix){
        int[] min = new int[0];
        int minimum = 0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < minimum){
                    min[0] = i;
                }
            }
        }
        return min;
    }

    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix){
        ArrayList<Integer> num = new ArrayList<>();
        int three;

        for(int i=0; i<matrix.length; i++){
            three = matrix[i][0];
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] % 3 == 0){
                    three = matrix[i][j];
                }
            }
            num.add(three);
        }
        return num;
    }
}


