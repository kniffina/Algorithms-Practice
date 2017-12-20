public class ComputeBinary {

    public static String computerBinary(int val) {
        if(val < 2) {
            return Integer.toString(val);
        } else {
            return computerBinary(val/2) + computerBinary(val%2);
        }
    }

    public static void main(String[] args) {
        int val = 11;

        System.out.println(computerBinary(val));
    }
}
