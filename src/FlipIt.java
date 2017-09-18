
public class FlipIt {
    public static void flipItVerticalAxis(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j =  0 ; j < matrix[i].length / 2 ; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = tmp;
            }
        }
    }
}
