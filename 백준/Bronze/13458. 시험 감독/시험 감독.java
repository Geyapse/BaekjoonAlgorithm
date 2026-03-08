import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}

		int b = in.nextInt();
		int c = in.nextInt();
		long count = 0;

		for(int i = 0; i < n; i++){
			arr[i] -= b;
			count++;
			if(arr[i]>0){
				if(arr[i]%c>0){
					count += arr[i]/c + 1;
				}else{
					count += arr[i]/c;
				}
			}

		}
		System.out.println(count);


	}
}
