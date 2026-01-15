import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[8][2];
		int sum = 0;

		for (int i = 0; i < 8; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = i + 1;
		}

		Arrays.sort(arr, (a,b) -> b[0] - a[0]);

		for(int i = 0; i < 5; i++){
			sum += arr[i][0];
		}

		System.out.println(sum);

		int[][] top = Arrays.copyOfRange(arr, 0, 5);

		Arrays.sort(top, (a,b) -> a[1] - b[1]);

		for(int i = 0; i < 5; i++){
			System.out.print(top[i][1] + " ");
		}

	}
}
