package NewJourney;

public class J8 {
    public static void main(String[] args) {

    }

    public int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {

                sum += accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
            return ans;

        }
        return ans;
    }
}
