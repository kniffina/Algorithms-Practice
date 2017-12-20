public class HorizontalFlip {

    public static void flipHorizontalAxis(int[][] matrix)  {
        int r = matrix.length;
        int c = matrix[0].length;
        int temp = 0;

        for(int i = 0; i < r / 2; i++) {
            for(int j = 0; j < c; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[r - 1][j];
                matrix[r - 1][j] = temp;
            }
        }


//        int n = matrix.length - 1;
//        for (int r = 0 ; r < n; r ++){
//            int[] temp = matrix[r];
//            matrix[r] = matrix[n - r];
//            matrix[n - r] = temp;
//        }
    }

    public static void main(String[] args) {
        int[][] multD = { {0, 0, 0}, {1, 1, 1},  {2, 2, 2}, {3, 3, 3} };
        for(int i = 0; i < multD.length; i++) {
            for(int j = 0; j < multD[0].length; j++) {
                System.out.print(multD[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
        flipHorizontalAxis(multD);

        for(int i = 0; i < multD.length; i++) {
            for(int j = 0; j < multD[0].length; j++) {
                System.out.print(multD[i][j] + " ");
            }
            System.out.println();
        }


    }
}
