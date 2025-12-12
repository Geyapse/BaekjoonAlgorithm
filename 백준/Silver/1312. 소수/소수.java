import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();

		a%=b;
		for(int i = 1; i <= n; i++){
			a*=10;
			int digit = a / b;
			if(i == n){
				System.out.println(digit);
			}
			a %= b;
		}

	}
}
