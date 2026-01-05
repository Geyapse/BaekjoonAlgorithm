import java.util.Scanner;

public class Main {
	static final int MOD = 1_000_000_007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long fibN = fib(n);

		System.out.println(fibN + " " + (n - 2));
	}

	static long fib(int n) {
		if (n <= 2) return 1;

		long a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			long c = (a + b) % MOD;
			a = b;
			b = c;
		}
		return b;
	}
}
