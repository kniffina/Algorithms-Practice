public class BubbleSort {

    public static int[] bubbleSortArray(int[] arr){
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 6, 7, 8, 4};
        bubbleSortArray(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
