public class BetterFibonacci {

    public static int betterFibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int num1 = 0;
        int num2 = 1;
        int temp = 0;

        for(int i = 2; i <= n; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        return num2;
    }

    public static void main(String[] args) {
        int x = 15;

        System.out.println(betterFibonacci(x));
    }
}
