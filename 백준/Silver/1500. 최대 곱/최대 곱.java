import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[k];
		int remain = 0;
		long count = 1;

		if(k == 1){
			System.out.println(s);
			return;
		}

		if(k == s){
			System.out.println(1);
			return;
		}

		int div = s/k;

		Arrays.fill(arr, div);

		remain = s - (div * k);

		for(int i = 0; i < remain; i++){
			arr[i] += 1;
		}

		for(int i = 0; i < k; i++){
			count *= arr[i];
		}

		System.out.println(count);

	}
}
