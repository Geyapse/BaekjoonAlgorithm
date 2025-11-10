import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int m = Integer.parseInt(n);
			for (int i = 1; i < m; i++) {
				int sum = i;
				String num = Integer.toString(i);
				for (int j = 0; j < num.length(); j++) {
					char c = num.charAt(j);
					int digit = Character.getNumericValue(c);
					sum += digit;
				}
				if (sum == m) {
					System.out.println(i);
					return;
				}
			}
		System.out.println(0);
		}
	}
