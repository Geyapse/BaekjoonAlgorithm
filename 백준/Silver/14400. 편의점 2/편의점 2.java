import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);

		long xc = x[n/2];
		long yc = y[n/2];

		for(int i = 0; i < n; i++) {
			sum += Math.abs(x[i] - xc);
			sum += Math.abs(y[i] - yc);
		}

		System.out.println(sum);


	}
}
