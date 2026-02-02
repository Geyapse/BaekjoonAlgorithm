import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		int height = 0;

		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);

		int left = 0;
		int right = arr[n-1];
		int answer = 0;

		while(left <= right){
			int mid = (left + right) / 2;

			long sum = 0;
			for(int i = 0; i < n; i++){
				if(arr[i] > mid){
					sum += arr[i] - mid;
				}
			}

			if(sum >= m){
				answer = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		System.out.println(answer);


	}
}
