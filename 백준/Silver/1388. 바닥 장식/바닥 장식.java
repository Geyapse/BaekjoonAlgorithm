import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[][] arr = new String[n][m];
		int count = 0;

		for (int i = 0; i < n; i++) {
			String line = in.next();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j) + "";
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (arr[i][j].equals("-")) {
					if (j == 0 || !arr[i][j - 1].equals("-")) {
						count++;
					}
				}

				if (arr[i][j].equals("|")) {
					if (i == 0 || !arr[i - 1][j].equals("|")) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
