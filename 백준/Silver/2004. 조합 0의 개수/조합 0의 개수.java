import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();

		long count2 = countP(n, 2) - countP(m, 2) - countP(n - m, 2);
		long count5 = countP(n, 5) - countP(m, 5) - countP(n - m, 5);

		System.out.println(Math.min(count2, count5));
	}

	public static long countP(long n, long p) {
		long count = 0;
		while (n > 0) {
			n /= p;
			count += n;
		}
		return count;
	}
	}

