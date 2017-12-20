public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        int[] arr = new int[256];

        for(int i = 0; i < s1.length(); i++) {
            int c1 = (int) s1.charAt(i);
            int c2 = (int) s2.charAt(i);

            //gives the 0-25 letter code
            //arr[s1.charAt(i) - 'a']

            arr[c1]++;
            arr[c2]--;
        }

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "catq";
        String s2 = "actg";

        System.out.println(isAnagram(s1, s2));
    }
}
