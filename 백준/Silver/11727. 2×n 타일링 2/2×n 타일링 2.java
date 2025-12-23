import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] dp = new long[n+1];
		int mod = 10007;
		if(n >= 1) dp[1] = 1;
		if(n >= 2) dp[2] = 3;
		for(int i = 3; i <= n; i++){
			dp[i] = (dp[i-1] + (dp[i-2] * 2)) % mod;
		}
		System.out.println(dp[n] % mod);
	}
}
