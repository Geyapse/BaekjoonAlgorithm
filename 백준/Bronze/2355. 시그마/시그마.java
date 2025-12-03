import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long n = in.nextLong();
		long m = in.nextLong();

		if(n > m){
			long temp = n;
			n = m;
			m = temp;
		}
		long count = m - n + 1;
		long sum = count * (n + m) / 2;
		System.out.println(sum);
	}
}
