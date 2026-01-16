import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double num;
		for(int i = 0; i < n; i++){
			int k = in.nextInt();
			int[] arr = new int[k];
			double sum = 0;
			double avg = 0;
			for(int j = 0; j < k; j++){
				arr[j] = in.nextInt();
				sum += arr[j];
			}
			avg = sum / k;
			num = 0;
			for(int l = 0; l < k; l++){
				if(arr[l] > avg){
					num++;
				}
			}

			System.out.printf("%.3f%%\n",num/k * 100);
		}
	}
}
