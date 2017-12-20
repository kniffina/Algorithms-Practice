import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String input1, String input2) {
        HashMap<Character, Integer> test1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> test2 = new HashMap<Character, Integer>();

        for(int i = 0; i < input1.length(); i++) {
            Character c = input1.charAt(i);

            if(test1.containsKey(c) ) {
                test1.put(c, test1.get(c) + 1);
            } else {
                test1.put(c, 1);
            }
        }

        for(int i = 0; i < input2.length(); i++) {
            Character c = input2.charAt(i);

            if(test2.containsKey(c) ) {
                test2.put(c, test2.get(c) + 1);
            } else {
                test2.put(c, 1);
            }
        }

        for(int i = 0; i < test1.size(); i++) {
            Character c1 = input1.charAt(i);
            Character c2 = input2.charAt(i);
            if( test1.get(c1) != test2.get(c2) ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
