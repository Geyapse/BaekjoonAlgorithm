import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		if(n*m%2==1){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}
}
