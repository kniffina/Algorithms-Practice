import java.util.Arrays;

public class ChildStaircase {

    public static int tripleStep(int n) {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else {
            return tripleStep(n - 3) + tripleStep(n - 2) + tripleStep(n - 1);
        }

    }

    public static int count(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1); //set val to -1
        return count(n, memo);

    }

    public static int count(int n, int[] memo) {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else if(memo[n] > -1) {
            return memo[n];
        }
        else {
            memo[n] = count(n - 3, memo) + count(n - 2, memo) + count(n - 1, memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(count(4));
    }
}
