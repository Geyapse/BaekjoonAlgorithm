import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		HashSet<Integer> set = new HashSet<>();

		for(int i = 0; i < n; i++){
			set.add(in.nextInt());
		}

		int m = in.nextInt();

		for(int i = 0; i < m; i++){
			if(set.contains(in.nextInt())){
				System.out.print(1 + " ");
			}else{
				System.out.print(0 + " ");
			}
		}

	}
}
