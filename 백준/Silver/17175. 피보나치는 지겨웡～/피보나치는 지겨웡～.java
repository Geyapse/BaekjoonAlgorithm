import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		final int mod = 1_000_000_007;
		long[] dp = new long[n+2];

		dp[0] = 1;
		dp[1] = 1;
		

		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + 1) % mod;
		}

		System.out.println(dp[n]);
	}
}