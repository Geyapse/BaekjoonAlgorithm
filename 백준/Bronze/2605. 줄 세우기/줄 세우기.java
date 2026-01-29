import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		List<Integer> list = new ArrayList<>();

		for(int i = 1; i <= n; i++){
			int x = in.nextInt();
			list.add(list.size() - x, i);
		}

		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
}
