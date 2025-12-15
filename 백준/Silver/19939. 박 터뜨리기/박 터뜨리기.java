import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int min = k * (k+1) / 2;

		if(n < min){
			System.out.println(-1);
			return;
		}

		int remain = n - min;

		if(remain % k == 0){
			System.out.println(k-1);
		}else{
			System.out.println(k);
		}
	}
}
