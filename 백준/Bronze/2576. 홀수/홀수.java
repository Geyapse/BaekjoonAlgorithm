import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < 7; i++){
			int x = in.nextInt();
			if(x % 2 != 0){
				sum += x;
				if(x < min){
					min = x;
				}
			}
		}
		if(sum == 0){
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
