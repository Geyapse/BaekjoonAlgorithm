import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long xor = 0;

		for (int i = 0; i < n; i++) {
			long m = in.nextLong();

			long k;
			if (m % 2 == 1) {
				k = (m + 1) / 2;
			} else{
				k = (m - 2) / 2;
			}

			xor ^= k;
		}

		if (xor == 0) {
			System.out.println("cubelover");
		} else {
			System.out.println("koosaga");
		}
	}
}