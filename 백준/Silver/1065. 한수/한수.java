import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num < 100) {
			cnt = num;
		} else {
			cnt = 99;

			for(int i = 100; i <= num; i++){
				int hundred = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if((hundred + one) == (ten * 2)){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
