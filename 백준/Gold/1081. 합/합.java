import java.util.Scanner;

public class Main{
	static long solve(long n) {
		long sum = 0;
		long digit = 1;

		while (digit <= n) {
			long high = n / (digit * 10);
			long cur = (n / digit) % 10;

			sum += high * 45 * digit;
			sum += (cur * (cur - 1) / 2) * digit;
			sum += cur * (n % digit + 1);

			digit *= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		System.out.println(solve(B) - (A > 0 ? solve(A - 1) : 0));
	}
}