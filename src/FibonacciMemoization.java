public class FibonacciMemoization {

    public static int fibonacci(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    public static int fibonacci(int n, int[] memo) {
        if(n == 0 || n == 1)
            return n;

        if(memo[n] == 0) {
            memo[n] = fibonacci(n - 2, memo) + fibonacci(n - 1, memo);
        }

        return memo[n];
    }

    public static int fibBottomUp(int n) {
        if(n == 0) return 0;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        for(int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n - 1] + memo[n - 2];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
