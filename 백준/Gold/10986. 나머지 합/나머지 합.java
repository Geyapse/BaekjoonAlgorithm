import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] count = new long[m];
		long prefix = 0;
		long answer = 0;


		for(int i = 0; i < n; i++){
			prefix = (prefix + in.nextLong()) % m;
			count[(int)prefix]++;
		}

		answer += count[0];

		for(int i = 0; i < m; i++){
			if(count[i] > 1){
				answer += (count[i] * (count[i] - 1)) / 2;
			}
		}

		System.out.println(answer);

	}
}
