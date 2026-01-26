import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] price = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			price[i] = in.nextInt();
		}

		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j] + price[j]);
			}
		}

		System.out.println(dp[n]);
	}
}
