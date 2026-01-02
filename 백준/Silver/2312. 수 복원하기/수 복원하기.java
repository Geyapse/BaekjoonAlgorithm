import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while(n-- > 0){
			int a = in.nextInt();

			for(int i = 2; i*i <= a; i++){
				int count = 0;
				while(a % i == 0){
					a /= i;
					count++;
				}
				if(count > 0){
					System.out.println(i + " " + count);
				}
			}
			if(a > 1) {
				System.out.println(a + " 1");
			}
		}
	}
}
