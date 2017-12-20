public class RaiseToPower {

    public static double pow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(x == 0) return x;

        if(n < 0) {
            x = 1/x;
            n = -n;
        }

        if(n % 2 > 0) {
            return x*pow(x*x, n/2);
        } else {
            return pow(x*x, n/2);
        }
    }

    public static void main(String[] args) {
        double x = 3;
        int n = 3;

        System.out.println(pow(x, 3));
    }
}
