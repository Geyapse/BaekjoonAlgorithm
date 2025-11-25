import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char c = in.next().charAt(0);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			String s = Integer.toString(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == c) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
