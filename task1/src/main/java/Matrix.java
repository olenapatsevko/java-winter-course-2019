import java.util.Arrays;

public class Matrix {


    protected static double[][] matrixRevert(double[][] matrix) {
        double[][] temp = new double[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = matrix[j][i];
            }
        }
        return temp;
    }

    protected static void print(double[][] matrix){
        for (int i =0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }



}