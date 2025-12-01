import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int money =	in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}
		in.close();

		int count = 0;
		int k = n-1;

		while(money > 0){

			if(k < 0)break;

			if(arr[k] <= money){
				money -= arr[k];
				count++;
				k = n-1;
			}else{
				k--;
			}
		}
		System.out.println(count);
	}
}
