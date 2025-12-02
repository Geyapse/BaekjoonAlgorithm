import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int w = in.nextInt();
		int[][] arr = new int[r+w+1][r+w+1];

		for(int i = 1; i <= r+w; i++){
			arr[i][1] = 1;
			arr[i][i] = 1;
			for(int j = 2; j < i; j++){
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		int answer = 0;
		for(int i = r; i < r+w; i++){
			for(int j = c; j <= c+(i-r); j++){
				answer += arr[i][j];
			}
		}
		System.out.println(answer);

	}
}
