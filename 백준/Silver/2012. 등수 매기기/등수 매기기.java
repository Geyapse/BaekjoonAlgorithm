import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		long temp = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		for(int i = 0; i < n; i++){
			temp += Math.abs(arr[i] - (i + 1));
		}

		System.out.println(temp);
	}
}
