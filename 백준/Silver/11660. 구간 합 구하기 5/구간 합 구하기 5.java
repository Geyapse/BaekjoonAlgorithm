import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int val = in.nextInt();
				dp[i][j] = dp[i - 1][j]
					+ dp[i][j - 1]
					- dp[i - 1][j - 1]
					+ val;
			}
		}

		for (int i = 0; i < m; i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();

			int result =
				dp[x2][y2]
					- dp[x1 - 1][y2]
					- dp[x2][y1 - 1]
					+ dp[x1 - 1][y1 - 1];

			System.out.println(result);
		}
	}
}
