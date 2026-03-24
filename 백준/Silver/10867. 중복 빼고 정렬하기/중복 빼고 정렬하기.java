import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		System.out.print(arr[0] + " ");
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			if(temp != arr[i]) {
				temp = arr[i];
				System.out.print(temp + " ");
			}
		}
	}
}
