import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n];

		for(int i = 0; i < n; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			d[i] = b - a;
		}

		Arrays.sort(d);

		if(n % 2 == 1){
			System.out.println(1);
		}else{
			int left = d[n / 2 - 1];
			int right = d[n / 2];
			System.out.println(right - left + 1);
		}
	}

}
