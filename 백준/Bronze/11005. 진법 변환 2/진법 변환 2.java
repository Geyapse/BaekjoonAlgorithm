import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		String num = Integer.toString(n, b);
		System.out.println(num.toUpperCase());
	}
}