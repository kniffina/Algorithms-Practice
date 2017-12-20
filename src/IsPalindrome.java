public class IsPalindrome {

    public static boolean isStringPalindrome(String str){
        if(str == null)
            return true;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        System.out.println(isStringPalindrome(str));
    }
}
