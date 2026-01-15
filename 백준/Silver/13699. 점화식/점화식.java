import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] dp = new long[n+1];
		dp[0] = 1;

		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				dp[i] += dp[j]*dp[i-1-j];
			}
		}
		System.out.println(dp[n]);
	}
}
