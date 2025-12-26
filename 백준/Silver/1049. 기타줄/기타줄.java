import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int minSix = Integer.MAX_VALUE;
		int minOne = Integer.MAX_VALUE;

		for(int i = 0; i < m; i++){
			int six = in.nextInt();
			int one = in.nextInt();

			minSix = Math.min(minSix, six);
			minOne = Math.min(minOne, one);
		}

		int cost1 = n * minOne;
		int cost2 = (n / 6) * minSix + (n % 6) * minOne;
		int cost3 = ((n / 6) + 1) * minSix;

		System.out.println(Math.min(cost1, Math.min(cost2, cost3)));
	}
}