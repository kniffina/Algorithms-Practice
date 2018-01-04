public class rotateSquareImageOfPicture {
    /***
     * Example of how to show rotations
     * @param matrix
     */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n / 2; i++) {
            for(int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1];
                matrix[j][n - 1] = matrix[n - 1][j];
                matrix[n - 1][j] = matrix[j][0];
                matrix[j][0] = temp;
            }

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
        int top = 0;
        int bot = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;

        while(top < bot && left < right) {

            // i is the offset. left + i < right is the
            // condition for the top, but top + i < bot would have worked, too

            //first iteration i = 0 left = 0 so 0, 1, 2, etc  0,0 0,1, 0,2
            for(int i = 0; left + i < right; i++) {
                int oldTopLeft = matrix[top][left + i];
                int oldTopRight = matrix[top + i][right];
                int oldBotRight = matrix[bot][right - i];
                int oldBotLeft = matrix[bot - i][left];

                matrix[top][left+ i] = oldTopRight;
                matrix[top + i][right] = oldBotRight;
                matrix[bot][right - i] = oldBotLeft;
                matrix[bot - i][left] = oldTopLeft;
            }

            bot--;
            top++;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        flipVerticalAxis(arr);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
