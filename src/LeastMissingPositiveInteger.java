import java.util.HashMap;

public class LeastMissingPositiveInteger {

    public static int leastInt(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int least = 1;
        hm.put(arr[1], 1);

        for(int i = 1; i < arr.length; i++) {
            int val = arr[i];
            if(hm.containsKey(val)) {

            }
            else {
                hm.put(val, 1);
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 4, -1, 1};
        int[] a2 = {1, 2, 0};

        System.out.println(leastInt(a1));
        System.out.println(leastInt(a2));
    }
}
