import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		boolean[] dp = new boolean[20];
		dp[1] = true;
		dp[2] = false;
		// dp[3] = true;
		// dp[4] = true;
		// dp[5] = true;
		// dp[6] = true;
		// dp[7] = false;
		// dp[8] = true;
		// dp[9] = false;
		// dp[10] = true;
		// dp[11] = true;
		// dp[12] = true;
		// dp[13] = true;
		// dp[14] = false; 		true 4개 false true false
		// dp[15] = true;
		// dp[16] = false;
		if(n==1){
			System.out.println("SK");
			return;
		}else if(n==2){
			System.out.println("CY");
			return;
		}
		if(n%7==0){
			System.out.println("CY");
		}else if(n%7==2){
			System.out.println("CY");
		}else{
			System.out.println("SK");
		}

	}
}
