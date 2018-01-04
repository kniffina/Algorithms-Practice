import java.util.ArrayList;

public class FindSpiral {
    public static ArrayList<Integer> findSpiral(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        if(arr == null)
            return list;

        int top = 0;
        int bottom = arr.length - 1; //rows
        int left = 0;
        int right = arr[0].length - 1;//columns

        while(true) {

            for(int i = left; i <= right; i++)
                list.add(arr[top][i]);

            top++;//went through top row
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++)
                list.add(arr[i][right]);
            right--;//went through right
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--)
                list.add(arr[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--)
                list.add(arr[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        ArrayList<Integer> list = findSpiral(arr);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
