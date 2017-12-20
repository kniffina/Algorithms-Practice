import java.util.HashMap;

public class FirstNonDuplicateCharInString {

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
        int length = str.length();

        Character c;

        //add chars to hashtable with how many values their are
        for(int i = 0; i < length; i++) {
            c = str.charAt(i);

            if(charHash.containsKey(c)) {
                //increment value based on key if found the key (character)
                charHash.put(c, charHash.get(c) + 1);
            } else {
                //put character into hasmap with key = char and value = 1
                charHash.put(c, 1);
            }
        }
        //loop through, if value is 1 then return that because that is first value
        //   that is not duplicated
        for(int i = 0; i < length; i++) {
            c = str.charAt(i);
            if(charHash.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String test = "abcdefga";
        System.out.println(firstNonRepeatedCharacter(test));
    }


}
