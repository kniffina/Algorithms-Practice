public class TreeMinimalHeight {

    public static TreeNode createMinimalBST(int[] arr) {
        //send to another helper with arr, start of 0 (beginning) and end of arr (length - 1)
        return createMinimalBST(arr, 0, arr.length - 1);
    }

    public static TreeNode createMinimalBST(int[] arr, int start, int end) {
        //crossed the mid way point
        if(end < start) {
            return null;
        }
        //get mid as an index of the array
        int mid = (start + end) / 2;

        //create new node with the arr[mid] to get the actual middle node value
        TreeNode node = new TreeNode(arr[mid],null, null);

        //recurse similar to binary search with arr, start is always zero, and mid - 1
        node.left = createMinimalBST(arr, 0, mid - 1);

        node.right = createMinimalBST(arr, mid + 1, end);

        return node;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // We needed this code for other files, so check out the code in the library
        TreeNode root = createMinimalBST(array);
        System.out.println("Root? " + root.data);

    }
}
