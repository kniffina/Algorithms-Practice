public class ReverseInt {
    public static int reverseInteger(int x) {
        int number = x;
        int remainder = 0;
        int reverse = 0;

        while(number != 0) {
            remainder = number % 10; //get the remainder of number
            reverse = reverse * 10 + remainder; //rebuild the number reverse by multiplying by next digit (10) and adding remainder
            number = number / 10; //deconstruct number
        }
        return reverse;
    }

    public static void main(String[] args) {
        int x = -321;

        System.out.println(reverseInteger(x));
    }
}
