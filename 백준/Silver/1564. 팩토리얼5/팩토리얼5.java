import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;

			while (result % 10 == 0) {
				result /= 10;
			}

			result %= 1_000_000_000_000L;
		}

		System.out.printf("%05d\n", result % 100000);

	}
}