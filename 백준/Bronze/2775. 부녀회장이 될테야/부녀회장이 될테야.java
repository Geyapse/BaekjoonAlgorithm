import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[][] dp = new int[15][15];

		for(int j = 1; j < 15; j++){
			dp[0][j] = j;
		}


		for(int k = 1; k < 15; k++){
			for(int n = 1; n < 15; n++){
				dp[k][n]=dp[k-1][n]+dp[k][n-1];
			}
		}

		for(int i = 0; i < t; i++){
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(dp[k][n]);
		}


	}
}
