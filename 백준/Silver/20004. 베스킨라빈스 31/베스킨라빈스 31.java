import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();

		for (int n = 1; n <= A; n++) {
			if (30 % (n + 1) == 0) {
				System.out.println(n);
			}
		}
		in.close();
	}
}