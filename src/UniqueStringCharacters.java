public class UniqueStringCharacters {

    public static boolean areAllCharactersUnique(String str){

        if(str == null) {
            return true;
        }

        boolean[] chars = new boolean[256];

        for(int i =0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);

            if(chars[ascii] == true) {
                return false;
            }
            else {
                chars[ascii] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String unique = "abcdefg";
        String notUnique = "aabbccddeeff";
        System.out.println(areAllCharactersUnique(unique));
        System.out.println(areAllCharactersUnique(notUnique));
    }
}
