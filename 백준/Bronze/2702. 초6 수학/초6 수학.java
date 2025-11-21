import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(lcm(a, b) + " " + gcd(a, b));
		}
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
