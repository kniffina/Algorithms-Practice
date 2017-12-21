import java.util.HashMap;

public class ProductOfAllNumbersButiArray {
    /*
    This problem was asked by Uber.

    Given an array of integers, return a new array such that each element at index i of the new array is the product
    of all the numbers in the original array except the one at i. Solve it without using division and in O(n) time.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

     In order to find the product of numbers before i, we can generate a list of prefix products. Specifically,
     the ith element in the list would be a product of all numbers including i. Similarly, we would generate the list
     of suffix products.

     */

    public static int[] productOfNumbers(int[] arr) {
        int[] newArr = new int[arr.length];

        //solution 1. Do a double for-loop O(n^2) time
        for(int i = 0; i < arr.length; i++) {
            int sum = 0; //each iteration set sum to 0
            for(int j = 0; j < arr.length; j++) {
                if(i != j)
                    if(sum == 0) {
                        sum += arr[j];
                    }
                    else {
                        sum *= arr[j];
                    }
            }
            System.out.println("Arr[" + i + "]: " + sum);
            newArr[i] = sum;

        }

        return newArr;
    }

    public static int[] productNotO2(int[] arr) {
        int[] newArr = new int[arr.length];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(sum == 0) sum += arr[i];
            else sum *= arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            newArr[i] =  (sum / arr[i]);
        }

        return newArr;
    }

    //since we can't use division we need to find another way
    //to solve in O(n) time
    public static int[] productsNoDivision(int[] arr) {
        if(arr.length < 2)
            throw new IllegalArgumentException("Need 3 or more args");

        int[] productsBefore = new int[arr.length];
        int productBefore = 1;

        //gets all the products before the number is used
        for(int i = 0; i < arr.length; i++) {
            productsBefore[i] = productBefore;
            productBefore *= arr[i];
        }

        int product = 1;

        //gets all the products after number is used
        //used with the before, we can get the before + after
        for(int i = arr.length - 1; i > -1; i--) {

            //24 * 1
            //6 * 5
            //2 * 20

            System.out.println("ProductsBefore[" + i + "]: " + productsBefore[i] + "  |  product: " + product);

            productsBefore[i] *= product;
            product *= arr[i];
        }

        return productsBefore;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        arr = productsNoDivision(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
