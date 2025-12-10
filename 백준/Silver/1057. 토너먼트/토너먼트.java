import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int kim = in.nextInt();
		int lim = in.nextInt();

		int count = 0;
		while(kim != lim) {
			kim = (kim + 1) / 2;
			lim = (lim + 1) / 2;
			count++;
		}
		System.out.println(count);
	}
}
