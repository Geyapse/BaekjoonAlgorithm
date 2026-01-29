import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int height = 0;
		int count = 0;

		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}

		for(int i = n-1; i >= 0; i--){
			if(arr[i] > height){
				height = arr[i];
				count++;
			}
		}

		System.out.println(count);

	}
}
