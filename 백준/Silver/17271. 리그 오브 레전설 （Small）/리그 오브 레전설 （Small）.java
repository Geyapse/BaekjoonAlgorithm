import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		final int mod = 1_000_000_007;
		long[] dp = new long[n + 1];

		dp[0] = 1;

		for(int i = 1; i <= n; i++) {
			dp[i] = dp[i-1];
			if(i >= m){
				dp[i] = (dp[i] + dp[i-m]) % mod;
			}
		}
		System.out.println(dp[n]);


	}
}
