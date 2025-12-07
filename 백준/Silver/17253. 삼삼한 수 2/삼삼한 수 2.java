import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		if(n == 0){
			System.out.println("NO");
			return;
		}
		String s = Long.toString(n, 3);
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '2'){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}
}
