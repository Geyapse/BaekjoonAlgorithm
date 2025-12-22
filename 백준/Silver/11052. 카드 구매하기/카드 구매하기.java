import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] dp = new int[n+1];
		int[] card = new int[n+1];

		for(int i = 1; i <= n; i++){
			card[i] = in.nextInt();
		}


		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				dp[i] = Math.max(dp[i],dp[i-j] + card[j]);
			}
		}

		System.out.println(dp[n]);

	}
}
