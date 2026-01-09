import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while(true){
			if(pel(n) && sosu(n)){
				break;
			}
			n++;
		}
		System.out.println(n);


	}

	public static boolean pel(int n) {
		String s = Integer.toString(n);
		String reversed = new StringBuilder(s).reverse().toString();
		return s.equals(reversed);
	}

	public static boolean sosu(int n){
		if(n < 2){
			return false;
		}

		for(int i = 2; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
