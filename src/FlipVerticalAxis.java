public class FlipVerticalAxis {

    public static void flipItVerticalAxis(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i < r; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][c - 1];
            matrix[i][c - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {1,0}};

        System.out.println("Before: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        flipItVerticalAxis(arr);

        System.out.println("After: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
