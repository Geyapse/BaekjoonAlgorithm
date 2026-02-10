import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = 0; i < n; i++){
			int x = in.nextInt();
			int sum = 0;

			for(int k = 1; k <= x; k++){
				int num = (k + 1) * (k + 2) / 2;
				sum += k * num;
			}

			System.out.println(sum);
		}
	}
}
