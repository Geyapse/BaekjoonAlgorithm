import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] time = new int[n+1];
		int[] money = new int[n+1];
		int[] dp = new int[n+2];
		
		for(int i = 1; i <= n; i++) {
			time[i] = in.nextInt();
			money[i] = in.nextInt();
		}

		for(int i = n; i >= 1; i--){
			if(i + time[i] <= n + 1){
				dp[i] = Math.max(money[i] + dp[i + time[i]], dp[i + 1]);
			} else {
				dp[i] = dp[i + 1];
			}
		}

		System.out.println(dp[1]);

	}
}
