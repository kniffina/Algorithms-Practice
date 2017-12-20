public class MaxGainIntArray {

    public static int maxGain(int[] arr) {
        int max = arr[1] - arr[0];
        int min = arr[0];

        for(int val : arr) {
            if(val - min > max)
                max = val - min;

            if(val < min)
                min = val;
        }

        return max < 0 ? 0 : max;
    }

    /*
     int max_gain = a[1] - a[0];
    int min = a[0];

    for(int i = 0; i < a.length; i++) {
        if(a[i] - min > max_gain) {
            max_gain = a[i] - min;
        }

        if(a[i] < min) {
            min = a[i];
        }
    }

    return max_gain;
     */

    public static void main(String[] args) {
        int[] arr = {100, 10, 100, 50, 20};

        System.out.println(maxGain(arr));
    }
}
