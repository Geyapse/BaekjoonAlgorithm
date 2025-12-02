import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		BigInteger[] dp = new BigInteger[n + 2];

		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]);
		}

		System.out.println(dp[n]);
	}
}
