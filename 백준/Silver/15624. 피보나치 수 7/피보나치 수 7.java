import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] dp = new long[n+1];
		if(n==0){
			System.out.println(0);
			return;
		}
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++){
			dp[i] = dp[i-1] + dp[i-2];
			if(dp[i]>=1000000007){
				dp[i]-=1000000007;
			}
		}
		System.out.println(dp[n]);
	}
}
