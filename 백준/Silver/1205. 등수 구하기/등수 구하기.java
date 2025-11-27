import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int score = in.nextInt();
		int p = in.nextInt();
		int[] arr = new int[n];
		int grade = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		if(n==p&&arr[n-1]>=score){
			System.out.println(-1);
			return;
		}

		for(int i = 0; i < n; i++){
			if(arr[i]>score){
				grade++;
			}
		}
		System.out.println(grade);
		
	}
}
