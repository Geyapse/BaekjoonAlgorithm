import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] dp = new boolean[n+5];

		dp[1] = true;
		dp[2] = false;
		dp[3] = true;
		dp[4] = true;
		for(int i = 5; i <= n; i++){
			if(!dp[i-1] || !dp[i-3] || !dp[i-4]){
				dp[i] = true;
			}else{
				dp[i] = false;
			}
		}
		System.out.println(dp[n] ? "SK" : "CY");

	}
}
