import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		Integer[] arr2 = new Integer[n];
		for(int i = 0; i < n; i++){
			arr1[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++){
			arr2[i] = in.nextInt();
		}
		in.close();
		int count = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int i = 0; i < n; i++){
			count += arr1[i] * arr2[i];
		}
		System.out.println(count);

	}
}
