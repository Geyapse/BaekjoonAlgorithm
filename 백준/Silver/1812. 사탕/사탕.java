import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] sum = new int[n];
		int[] each = new int[n];

		for(int i = 0; i < n; i++){
			sum[i] = in.nextInt();
		}

		int count = 0;

		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				count+=sum[i];
			}else{
				count-=sum[i];
			}
		}


		each[0] = count /= 2;

		for(int i = 1; i < n; i++){
			each[i] = sum[i-1]-each[i-1];
		}

		for(int i = 0; i < n; i++){
			System.out.println(each[i]);
		}
	}
}
