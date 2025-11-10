import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		String strn = "";
		String strm = "";
		while(n > 0){
			strn += Integer.toString(n%10);
			n = n/10;
		}
		while(m > 0){
			strm += Integer.toString(m%10);
			m = m/10;
		}
		int x = Integer.parseInt(strn);
		int y = Integer.parseInt(strm);

		System.out.println(Math.max(x, y));
	}
}
