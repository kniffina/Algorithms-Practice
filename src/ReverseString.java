public class ReverseString {

    public static String reverseString(String str){
        if(str == null) {
            return null;
        }
        String inputString = str;
        String outputString = null;

        StringBuilder builtString = new StringBuilder();

        for(int i = str.length() -1; i >= 0; i--) {
            builtString.append(str.charAt(i));
        }

        outputString = builtString.toString();

        return outputString;
    }

    public static void main(String[] args) {
        String str = "reverse this bitch";
        System.out.println(reverseString(str));
    }
}
