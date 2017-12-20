import java.util.HashMap;

public class CoupleSumIntArray {

    public static int[] coupleSum(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int goal = target - n;

            if(hashMap.containsKey(n)) {
                //returns i + 1 because it says 1 = 0
                return new int[]{hashMap.get(n), i + 1};
            } else {
                //i + 1 because 1 = start of array
                hashMap.put(goal, i + 1);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2, 3, 10, 7, 22, 15, 5, 1, 12, 13};

        int[] newArr = coupleSum(arr, 15);

        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

}
