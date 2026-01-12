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

		if(n % 2 != 0){
			System.out.println(arr[n/2]);
		}else{
			System.out.println(arr[(n-1)/2]);
		}

	}
}
