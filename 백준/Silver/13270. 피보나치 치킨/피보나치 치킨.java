import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = 0;
		int max = 0;

		if(n % 2 == 0){
			min = n/2;
		}else{
			min = (n/2) + 1;
		}

		if (n % 3 == 0) {
			max = (n / 3) * 2;
		} else if (n % 3 == 1) {
			max = ((n - 4) / 3) * 2 + 2;
		} else {
			max = ((n - 2) / 3) * 2 + 1;
		}

		System.out.println(min + " " + max);

	}


	public static int fib(int n) {
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
