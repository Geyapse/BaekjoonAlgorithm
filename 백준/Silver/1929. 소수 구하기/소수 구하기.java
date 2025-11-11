import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = n; i <= m; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}

	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}
