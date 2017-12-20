public class InsertStarString {

    public static String insertPairStar(String s) {
        if(s == null)
            return null;
        else if(s.length() == 1)
            return s;

        //recursive case for matching
        else if (s.substring(0, 1).equals(s.substring(1, 2))){
            return s.substring(0, 1) + "*" + insertPairStar(s.substring(1, s.length()));
        }

        return s.substring(0, 1) + insertPairStar(s.substring(1, s.length()));
    }

    public static void main(String[] args) {
        String s = "cc";

        System.out.println(insertPairStar(s));
    }
}
