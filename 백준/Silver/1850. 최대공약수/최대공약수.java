import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long g = gcd(n, m);

		StringBuilder sb = new StringBuilder();
		for(long i = 0; i < g; i++){
			sb.append('1');
		}
		System.out.println(sb);
	}

	public static long gcd(long a, long b) {
		while (b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}


}
