import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < m; i++){
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;

			while(a<b){
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
