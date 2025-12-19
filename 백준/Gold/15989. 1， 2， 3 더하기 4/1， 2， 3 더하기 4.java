import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] dp = new int[10001][4];

		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[2][1] = 1;
		dp[2][2] = 2;
		dp[2][3] = 2;
		dp[3][1] = 1;
		dp[3][2] = 2;
		dp[3][3] = 3;

		for(int i = 4; i <= 10000; i++){
			dp[i][1] = 1;
			dp[i][2] = dp[i][1] + dp[i-2][2];
			dp[i][3] = dp[i][2] + dp[i-3][3];
		}

		for(int i = 0; i < n; i++){
			int k = in.nextInt();
			int answer = dp[k][3];
			System.out.println(answer);
		}

	}
}
