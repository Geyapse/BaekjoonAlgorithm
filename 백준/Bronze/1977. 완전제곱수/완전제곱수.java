import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int i = 1;

		while(true) {
			if(n <= i * i && i * i <= m){
				sum += i*i;
				if(i*i < min){
					min = i*i;
				}
			}
			i++;
			if(i*i>m){
				break;
			}
		}
		if(sum != 0){
			System.out.println(sum);
			System.out.println(min);
		}else{
			System.out.println(-1);
		}

	}
}
