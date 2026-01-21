import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int max = 0;
		for(int i = 0; i < 10; i++){
			if(count > max){
				max = count;
			}
			int n = in.nextInt();
			count -= n;
			int m = in.nextInt();
			count += m;
		}
		System.out.println(max);
	}
}
