import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		int mod = 1000000;
		int pisano = 1500000;

		n = n % pisano;

		long[] fib = new long[(int)n + 2];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= n; i++) {
			fib[i] = (fib[i-1] + fib[i-2]) % mod;
		}

		System.out.println(fib[(int)n]);
	}
}
