import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[][] arr = new long[n][2];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i][0] = in.nextLong();
			arr[i][1] = in.nextLong();
			sum += arr[i][1];
		}

		Arrays.sort(arr, (a,b) -> Long.compare(a[0],b[0]));

		long half = (sum + 1) / 2;
		long total = 0;

		for(int i = 0; i < n; i++){
			total += arr[i][1];
			if(total >= half){
				System.out.println(arr[i][0]);
				break;
			}
		}
	}
}
