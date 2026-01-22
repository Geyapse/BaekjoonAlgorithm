import java.util.Scanner;

public class Main {
	public static int count = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		fib(n);
		System.out.println(count + " " + (n - 2));

	}
	public static long fib(int n) {
		if(n <= 2){
			count++;
			return 1;
		}else{
			return fib(n - 1) + fib(n - 2);
		}
		}
	}

