import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		in.close();

		if((n-1) % (m+1) == 0){
			System.out.println("Can't win");
		}else{
			System.out.println("Can win");
		}
	}
}
