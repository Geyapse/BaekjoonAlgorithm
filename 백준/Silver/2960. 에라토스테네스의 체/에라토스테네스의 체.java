import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		boolean[] removed = new boolean[n+1];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if(!removed[i]) {
				for (int j = i; j <= n; j+=i) {
					if(!removed[j]) {
						removed[j] = true;
						count++;

						if(count == k) {
							System.out.println(j);
							return;
						}
					}
				}
			}
		}
	}
}
