public class rotateSquareImageOfPicture {
    /***
     * Example of how to show rotations
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        // while this is a square that needs to be rotated
        while (top < bot && left < right) {
            // i is the offset. left + i < right is the condition for the top, but top + i < bot would have worked, too
            for (int i = 0; left + i < right; ++i) {
                int oldTopLeft = matrix[top][left + i];
                int oldTopRight = matrix[top + i][right];
                int oldBotRight = matrix[bot][right - i];
                int oldBotLeft = matrix[bot - i][left];
                matrix[top][left + i] = oldBotLeft;
                matrix[top + i][right] = oldTopLeft;
                matrix[bot][right - i] = oldTopRight;
                matrix[bot - i][left] = oldBotRight;
            }
            // move to inner square
            ++top;
            --right;
            --bot;
            ++left;
        }
    }

    public static void rotateSquareImageCW(int[][] matrix) {
        transposeMatrix(matrix);
        flipVerticalAxis(matrix);
    }


    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length - 1;
        int temp = 0;
        for(int i = 0; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void flipVerticalAxis(int[][] matrix) {
        int n = matrix.length - 1;
        int temp = 0;

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j];
                matrix[i][n-j] = temp;
            }
        }
    }
}
