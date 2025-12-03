import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long result = 1;
		int count2 = 0;
		int count5 = 0;

		for(int i = 1; i <= n; i++){

			int x = i;

			while(x % 2 == 0){
				count2++;
				x/=2;
			}
			while(x % 5 == 0){
				count5++;
				x/=5;
			}
			result = (result * x) % 100000;
		}

		int k = count2 - count5;

		for(int i = 0; i < k; i++){
			result = (result * 2) % 100000;
		}

		while(result % 10 == 0){
			result /= 10;
		}
		System.out.println(result%10);

	}
}
