import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int mod = 1_000_000_000;
		long[] dp = new long[1000001];
		dp[0] = 0;
		dp[1] = 1;

		for(int i = 2; i <= 1000000; i++){
			dp[i] = (dp[i-1] + dp[i-2]) % mod;
		}
		if(n < 0){
			if(Math.abs(n) % 2 == 0){
				System.out.println(-1);
			}else{
				System.out.println(1);
			}
			System.out.println(dp[Math.abs(n)]);
		}else if(n == 0){
			System.out.println(0);
			System.out.println(0);
		}else{
			System.out.println(1);
			System.out.println(dp[n]);
		}
	}
}
