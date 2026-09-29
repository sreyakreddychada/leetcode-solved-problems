class Solution {

    int m, n;
    Boolean dp[][][];

    public boolean hasValidPath(char[][] grid) {

        m = grid.length;
        n = grid[0].length;

        if ((m + n - 1) % 2 != 0)
            return false;

        dp = new Boolean[m][n][m + n + 1];

        return solve(grid, 0, 0, 0);
    }

    public boolean solve(char[][] grid, int i, int j, int count) {

        if (grid[i][j] == '(')
            count++;
        else
            count--;

        if (count < 0)
            return false;

        if (count > m + n - 1 - i - j)
            return false;

        if (i == m - 1 && j == n - 1)
            return count == 0;

        if (dp[i][j][count] != null)
            return dp[i][j][count];

        boolean ans = false;

        if (i + 1 < m)
            ans = solve(grid, i + 1, j, count);

        if (j + 1 < n && !ans)
            ans = solve(grid, i, j + 1, count);

        return dp[i][j][count] = ans;
    }
}