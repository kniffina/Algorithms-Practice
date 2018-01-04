public class RotateArrayLeft {

    //pretend 1,2,3,4,5
    public static int[] rotateLeft(int[] arr, int k) {
        if(arr == null) return null;

        // would be 2 % 5 = 2 or in position arr[3] = 4th position
        int actualShifts = k % arr.length; //incase shift = 5 and arr.length = 5

        reverse(arr, 0, arr.length - 1); //rotate entire array

        //reverse from 5 - 2 - 1 = 2; start at arr[2] = 3rd position
        //so 5, 4, = 4, 5
        //
        reverse(arr, 0, arr.length - actualShifts - 1);


        reverse(arr, arr.length - actualShifts, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        if(arr == null || arr.length == 1) return;

        //first iteration after reverse entire array
        //  - left = 0 | right = 5 - 2 - 1 = 2
        while(left < right) {
            System.out.println("Left: " + left + "  |   Right: " + right);
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateLeft(arr, 2);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
