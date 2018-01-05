import java.util.ArrayList;

public class PrintPaths2dBoard {

    public static ArrayList<String> printPaths(char[][] board) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        search(0, 0, board, sb, list);
        return list;
    }

    public static void search(int i, int j, char[][] board, StringBuilder sb, ArrayList<String> out) {
        int bottom = board.length; //rows
        int right = board[0].length; //columns

        if(i > bottom - 1 || j > right - 1) return;

        sb.append(board[i][j]);

        //we've reached the bottom right, add path to list
        if(i == bottom - 1 && j == right - 1) {
            out.add(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        search(i + 1, j, board, sb,out);//search down
        search(i, j + 1, board, sb, out);//search right
        sb.deleteCharAt(sb.length() - 1); //unmark
    }

    public static void main() {
        char[][] arr = {{'A', 'B'}, {'C', 'D'}};

        ArrayList<String> list = printPaths(arr);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
