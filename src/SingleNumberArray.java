import java.util.Hashtable;

public class SingleNumberArray {

    public static int singleNumber(int[] A) {
        //Key - array value || Value - Occurrences
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for(int i = 0; i < A.length; i++) {
            if(ht.containsKey(A[i])) {
                ht.put(A[i], ht.get(A[i]) + 1);
            } else {
                ht.put(A[i], 1);
            }
        }

        for(int i = 0; i < A.length; i++) {
            if(ht.containsKey(A[i])) {
                if (ht.get(A[i]) == 1) {
                    return A[i];
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        System.out.println(singleNumber(arr));
    }
}
