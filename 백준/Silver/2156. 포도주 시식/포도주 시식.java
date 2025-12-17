import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] dp = new int[n+1];
		int[] podo =  new int[n+1];

		for(int i = 1; i <= n; i++){
			podo[i] = in.nextInt();
		}

		if(n==1){
			System.out.println(podo[1]);
			return;
		}

		dp[0] = 0;
		dp[1] = podo[1];
		dp[2] = podo[2] + podo[1];

		for(int i = 3; i <= n; i++){
			dp[i] = Math.max(dp[i-1],
				Math.max(dp[i-2] + podo[i],
					dp[i-3] + podo[i-1] + podo[i]));
		}

		System.out.println(dp[n]);
	}
}
