import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if(n==1) {
			System.out.println(0);
			return;
		}
		int dasom = in.nextInt();
		int[] arr = new int[n-1];

		for(int i = 0; i < n-1; i++){
			arr[i] = in.nextInt();
		}

		int count = 0;

		while(true){
			Arrays.sort(arr);

			int max = arr[n - 2];

			if(max<dasom) {
				break;
			}
				arr[n-2]--;
				dasom++;
				count++;

		}
		System.out.println(count);
	}
}
