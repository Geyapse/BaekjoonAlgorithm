import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int i = 0; i < test; i++) {
			long r = in.nextInt();
			long n = in.nextInt();
			long sum = 1;
			for (int j = 0; j < r; j++) {
				sum *= n - j;
				sum /= j + 1;
			}
			System.out.println(sum);
		}

	}
}
