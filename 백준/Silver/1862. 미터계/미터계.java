import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		long answer = 0;

		for(int i = 0; i < n.length(); i++){
			int digit = n.charAt(i) - '0';

			if(digit > 4){
				digit--;
			}
			answer = answer * 9 + digit;

		}

		System.out.println(answer);
	}
}
