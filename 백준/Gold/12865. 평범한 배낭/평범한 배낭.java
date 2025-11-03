import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 물품 수
		int k = in.nextInt(); // 무게

		int[] w = new int[n+1];
		int[] v = new int[n+1];

		for (int i = 1; i <= n; i++) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		in.close();
		int[] dp = new int[k+1];

		for (int i = 1; i <= n; i++) {
			for (int j = k; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
			}
		}
		System.out.println(dp[k]);

	}
}
