public class EditDistance {

    public int editDistance(String a, String b) {
        int lenA = a.length(), lenB = b.length();
        int[][] memo = new int[lenA][lenB];

        for(int i = 0; i <= lenA; i++) {
            memo[i][0] = i;
        }

        for(int i = 0; i <= lenB; i++) {
            memo[0][i] = i;
        }

        for(int i = 1; i <= lenA; i++) {
            Character cA = a.charAt(i - 1);
            for(int j = 1; j <= lenB; j++) {
                char cB = b.charAt(j - 1);
                if(cA == cB) {
                    memo[i][j] = memo[i - 1][j - 1];
                }
                else {
                    int replaceDist = 1 + memo[i - 1][j - 1];
                    int insertDist = 1 + memo[i][j - 1];
                    int deleteDist = 1 + memo[i - 1][j];
                    int minDist = Math.min(replaceDist, Math.min(insertDist, deleteDist));
                    memo[i][j] = minDist;
                }
            }
        }
        return memo[lenA][lenB];
    }
}
