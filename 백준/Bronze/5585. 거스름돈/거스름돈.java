import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pay = 1000 - n;
		int count = 0;
		
			count += pay / 500;
			pay = pay % 500;
			count += pay / 100;
			pay = pay % 100;
			count += pay / 50;
			pay = pay % 50;
			count += pay / 10;
			pay = pay % 10;
			count += pay / 5;
			pay = pay % 5;
			count += pay;

		System.out.println(count);


	}
}
