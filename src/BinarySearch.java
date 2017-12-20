public class BinarySearch {

    public static Boolean binarySearch(int[] arr, int n) {
        int high = arr.length - 1;
        int low = 0;

        while(low < high) {
            int mid = low + (high - low) / 2;

            //arr[mid] greater so n is less than mid
            if(arr[mid] > n) {
                high = mid - 1;
            }
            //arr[mid] is less than n so n is greater than mid
            else if(arr[mid] < n) {
                low = mid + 1;
            }
            else
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(binarySearch(arr, 3));
    }
}
