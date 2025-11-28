import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(nextPrime(in.nextLong()));
		}
	}
	public static long nextPrime(long n) {
		if(n<=2) return 2;
		long num = n;
		while(!isPrime(num)) {
			num++;
		}
		return num;
	}
	public static boolean isPrime(long n) {
		if (n < 2) return false;
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

}
