import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] arr = new Integer[n];
		int answer = 0;

		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());
		answer = arr[arr.length-1] * n;

		int temp = 0;
		for(int i = 0; i < n; i++){
			temp = arr[i]*(i+1);
			if(temp > answer){
				answer = temp;
			}

		}
		System.out.println(answer);
	}
}
