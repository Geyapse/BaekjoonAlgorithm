import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int up = 1;
		int down = 1;
		int answer = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i]>=arr[i-1]) {
				up++;
			}else{
				up = 1;
			}

			if(arr[i]<=arr[i-1]) {
				down++;
			}else{
				down = 1;
			}
			answer = Math.max(answer,Math.max(up,down));
		}
		System.out.println(answer);
	}
}
