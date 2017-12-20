public class CountCompressionStringInRow {

    public static String compress(String str) {
        if(str == null) return "";

        int countConsecutive = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(compress(str));
    }

}
