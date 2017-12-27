import java.util.HashMap;

public class MissingPositiveIntegerArray {

    //hashmap approach. O(n) time and space
    public static int missingIntMap(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int key = arr[i];

            if(arr[i] <= 0) {
                continue;
            }
            else {
                if(hm.containsKey(key))
                    hm.put(key, hm.get(key) + 1);
                else
                    hm.put(key, 1);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            int key = i + 1; //key = 1 2 3 4

            if(!hm.containsKey(key))
                return key;
        }
        return 1;
    }

    //inline approach. O(n) time O(1) space;
    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length)
                i++;
            /*
            1. A[A[0] - 1 = 2 ]
            2. A[A[1] - 1 = 1 ]
            3. A[A[2] - 1 = -2]
            4. A[A[3] - 1 = 0 ]
            5. A[A[4] - 1 = 4 ]
             */
            else if(A[A[i]-1] != A[i]) {
                System.out.print("i: " + i + "  |  ");
                System.out.print("A[A[i] - 1]: " + A[A[i] - 1] + "  |  ");
                System.out.print("A[A[i]]: " + A[A[i]] + "  |  ");
                System.out.println("A[i]: " + A[i]);

                swap(A, i, A[i] - 1);
            }

            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1)
            i++;
        return i+1;
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 1, 5};

        System.out.println(firstMissingPositive(arr));
    }
}
