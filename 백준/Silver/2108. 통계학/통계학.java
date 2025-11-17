import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] count = new int[8001];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
			count[arr[i]+4000]++;
		}
		Arrays.sort(arr);
		long avg = Math.round(sum/n);
		int max = 0;
		for(int c : count) if (c > max) max = c;
		int mode = 0;
		boolean first = false;
		for (int i = 0; i < 8001; i++){
			if(count[i] == max) {
				if(!first) {
					mode = i - 4000;
					first = true;
				} else {
					mode = i - 4000;
					break;
				}
			}
		}
		System.out.println(avg);
		System.out.println(arr[((n+1)/2)-1]);
		System.out.println(mode);
		System.out.println(arr[n-1]-arr[0]);
	}
}
