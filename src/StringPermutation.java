public class StringPermutation {

    public static boolean permutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[256];
        char[] str1Arr = str1.toCharArray();

        for(char c : str1Arr) {
            letters[c]++;
        }

        for(int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);

            if(letters[c] - 1 < 0)
                return false;
        }
        return true;
    }
}
