public class ReplaceAllSpaces {

    public static String replace(String a, String b) {
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') {
                newString.append(b);
            } else {
                newString.append(a.charAt(i));
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String s = "This is a test";
        System.out.println(replace(s, "Poop"));
    }
}
