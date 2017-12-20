public class PalindromeInteger {

    public static Boolean isIntPalindrome(int x) {
        int num = x;
        int reverse = 0;
        int remainder = 0;
        while(num > 0) {
            System.out.println("Remainder: " + remainder);
            System.out.println("Num: " + num);
            System.out.println("Reverse: " + reverse);

            /***************************************
             *      MAIN CODE
             ****************************************/
            remainder = num % 10; //get the remainder of number
            reverse = reverse * 10 + remainder; //rebuild the number reverse by multiplying by next digit (10) and adding remainder
            num = num / 10; //deconstruct number

            /***************************************
             *      MAIN CODE
             ****************************************/

            System.out.println();

            System.out.println("Remainder 2: " + remainder);
            System.out.println("Num 2: " + num);
            System.out.println("Reverse 2: " + reverse);

            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println(reverse);
        return (reverse == x);
    }

    public static void main(String[] args) {
        int value = 1221;

        System.out.println(isIntPalindrome(value));
    }
}
