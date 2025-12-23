import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];

		for(int i = 1; i <= n; i++){
			arr[i] = in.nextInt();
		}

		dp[1] = arr[1];
		int answer = dp[1];

		for(int i = 2; i <= n; i++){
			dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
			answer = Math.max(answer, dp[i]);
		}

		System.out.println(answer);
	}
}
