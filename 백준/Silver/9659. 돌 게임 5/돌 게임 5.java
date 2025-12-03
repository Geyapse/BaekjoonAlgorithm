import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		if(n%2==0){
			System.out.println("CY");
		}else{
			System.out.println("SK");
		}
		// boolean[] dp = new boolean[n+4];
		// dp[1] = true;
		// dp[2] = false;
		// dp[3] = true;
		// for(int i = 4; i <= n; i++){
		// 	if(dp[i-1]){
		// 		dp[i] = false;
		// 	}else{
		// 		dp[i] = true;
		// 	}
		// }
		//
		// System.out.println(dp[n] ? "SK" : "CY");
	}
}
