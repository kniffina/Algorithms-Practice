public class ZeroMatrix {

    public static void nullifyrow(int[][] arr, int row) {
        for(int i = 0; i < arr[0].length; i++) {
            arr[row][i] = 0;
        }
    }

    public static void nullifycolumn(int[][] arr, int col) {
        for(int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }

    public static void addZero(int[][] arr) {
        boolean[] row = new boolean[arr.length];
        boolean[] col = new boolean[arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < row.length; i++) {
            if(row[i])
                nullifyrow(arr, i);
        }

        for(int i = 0; i < row.length; i++) {
            if(col[i])
                nullifycolumn(arr, i);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 2, 3}, {4, 5, 6}, {7, 8 , 9}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        addZero(arr);

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
