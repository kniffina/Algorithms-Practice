public class MergeSortTwoArrays {

    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int leftL = arrLeft.length;
        int rightL = arrRight.length;

        int[] arrMerged = new int[leftL + rightL];

        int leftIndex  = 0;
        int rightIndex = 0;
        int indexMerged = 0;

        while(leftIndex < leftL && rightIndex < rightL) {
            if(arrLeft[leftIndex] < arrRight[rightIndex]) {
                arrMerged[indexMerged++] = arrLeft[leftIndex++];
            } else {
                arrMerged[indexMerged++] = arrRight[rightIndex++];
            }
        }

        while(leftIndex < leftL) {
            arrMerged[indexMerged++] = arrLeft[leftIndex++];
        }

        while(rightIndex < rightL) {
            arrMerged[indexMerged++] = arrRight[rightIndex++];
        }

        return arrMerged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9, 10, 11};
        int[] arr2 = {2, 3, 4, 6, 8, 13};

        int[] arrMerge = merge(arr1, arr2);

        for(int i = 0; i < arrMerge.length; i++) {
            System.out.print(arrMerge[i] + " ");
        }
        System.out.println();
    }
}
