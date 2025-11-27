import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int temp = m;
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++){

			if(arr[i]<=temp){
				temp -= arr[i];
			}else {
				temp = m;
				temp -= arr[i];
				count++;
			}

			 if(i == n-1 && temp!=m){
			 	count++;
			 }

		}

		System.out.println(count);
	}
}
