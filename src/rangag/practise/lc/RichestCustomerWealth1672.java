package rangag.practise.lc;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxWealth = 0;
        int wealth = 0;
        for (int i = 0; i < m; i++) {
            wealth = 0;
            for (int j = 0; j < n; j++)
                wealth += accounts[i][j];
            if (maxWealth < wealth)
                maxWealth = wealth;
        }
        return maxWealth;
    }
}

