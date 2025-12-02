import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] dpa = new int[n+2];
		int[] dpb = new int[n+2];
		dpa[0] = 0;
		dpa[1] = 1;
		dpa[2] = 1;
		dpb[0] = 1;
		dpb[1] = 1;
		dpb[2] = 2;
		for(int i=3; i<=n; i++) {
			dpa[i] = dpa[i-1] + dpa[i-2];
			dpb[i] = dpb[i-1] + dpb[i-2];
		}
		System.out.println(dpa[n-1]+" "+dpb[n-1]);
	}
}
