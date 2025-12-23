import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		double gg = in.nextDouble();
		double gb = in.nextDouble();
		double bg = in.nextDouble();
		double bb = in.nextDouble();

		double[][] dp = new double[n + 1][2];

		if (m == 0) {
			dp[0][0] = 1;
			dp[0][1] = 0;
		} else {      
			dp[0][0] = 0;
			dp[0][1] = 1;
		}

		for (int i = 1; i <= n; i++) {
			dp[i][0] = dp[i - 1][0] * gg + dp[i - 1][1] * bg;
			dp[i][1] = dp[i - 1][0] * gb + dp[i - 1][1] * bb;
		}

		System.out.println((int)(dp[n][0] * 1000));
		System.out.println((int)(dp[n][1] * 1000));
	}
}
