import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long m = in.nextInt();
        in.close();
		long k = lcm(n,m);
		System.out.println(k);

	}

	public static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
