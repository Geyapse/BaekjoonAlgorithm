import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int m = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int num = in.nextInt();
			sb.append(map.getOrDefault(num, 0)).append(" ");
		}

		System.out.println(sb);
	}
}
