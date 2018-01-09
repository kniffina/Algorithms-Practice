import java.util.ArrayList;

public class CombineParenthesis {

    public static ArrayList<String> combParenthesis(int pairs) {
        ArrayList<String> res = new ArrayList<String>();
        if(pairs > 0) {
            combineParenthesis(pairs, pairs, "", res);
        }
        return res;
    }

    public static void combineParenthesis(int left, int right, String tmp, ArrayList<String> list) {
        if(left == 0 && right == 0)
            list.add(tmp);
        else {
            if(left > 0)
                combineParenthesis(left - 1, right, tmp + "(", list);
            if(right > left)
                combineParenthesis(left, right - 1, tmp+ ")", list);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayList<String> list = combParenthesis(2);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
