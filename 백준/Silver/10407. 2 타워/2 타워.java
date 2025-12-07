import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double k = in.nextDouble();
		if(k == 1){
			System.out.println(2);
			return;
		}
		if(k >= 2){
			System.out.println(1);
			return;
		}
	}
}
