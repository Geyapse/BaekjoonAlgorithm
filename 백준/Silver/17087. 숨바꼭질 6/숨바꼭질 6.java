import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();

		int result = 0;

		for(int i = 0; i < n; i++){
			int x = in.nextInt();
			int dist = Math.abs(x - s);
			result = gcd(dist, result);
		}
		System.out.println(result);

	}
	public static int gcd(int a, int b){
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
