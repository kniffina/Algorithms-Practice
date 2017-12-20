public class TransposeSquareMatrix {

    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (i + 1); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2} };

        System.out.println("** Before **");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        transposeMatrix(arr);
        System.out.println("** After **");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
