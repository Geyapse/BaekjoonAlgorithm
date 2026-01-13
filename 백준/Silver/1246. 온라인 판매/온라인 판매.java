import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[m];

		for(int i = 0; i < m; i++){
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		int maxProfit = 0;
		int bestPrice = 0;

		for (int i = 0; i < m; i++) {
			int price = arr[i];
			int count = Math.min(n, m - i);
			int profit = price * count;

			if (profit > maxProfit) {
				maxProfit = profit;
				bestPrice = price;
			}
		}

		System.out.println(bestPrice + " " + maxProfit);
	}
}