import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		if(n == 0){
			System.out.println(0);
			return;
		}
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}

		int count = 1;
		int temp = m;

		for(int i = 0; i < n; i++){
			if(arr[i]<=temp){
				temp -= arr[i];
			}else {
				count++;
				temp = m - arr[i];
			}
		}

		System.out.println(count);
	}
}
