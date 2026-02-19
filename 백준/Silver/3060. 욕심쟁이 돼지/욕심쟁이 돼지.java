import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int tc = 0; tc < n; tc++) {
			long t = in.nextLong();

			long[] arr = new long[6];
			long sum = 0;

			for (int i = 0; i < 6; i++) {
				arr[i] = in.nextLong();
				sum += arr[i];
			}

			int day = 1;
			while (sum <= t) {
				long[] next = new long[6];

				for (int i = 0; i < 6; i++) {
					next[i] = arr[i]
						+ arr[(i + 1) % 6]
						+ arr[(i + 5) % 6]
						+ arr[(i + 3) % 6];
				}

				arr = next;

				sum = 0;
				for (int i = 0; i < 6; i++) sum += arr[i];

				day++;
			}

			System.out.println(day);
		}
	}
}