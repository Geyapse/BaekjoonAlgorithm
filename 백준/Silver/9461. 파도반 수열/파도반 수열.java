import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] dp = new long[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		dp[6] = 3;

		for(int i = 7; i <= 100; i++){
			dp[i] = dp[i-1] + dp[i-5];
		}

		for(int i = 0; i < n; i++){
			int k = in.nextInt();
			System.out.println(dp[k]);
		}

	}
}
