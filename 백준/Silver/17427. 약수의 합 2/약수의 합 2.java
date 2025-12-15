import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long count = 0;

		for(long i = 1; i <= n; i++) {
			count += i * (n / i);
		}


		System.out.println(count);
	}
}
