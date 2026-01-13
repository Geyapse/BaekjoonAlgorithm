import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];

		for(int i = 0; i < n; i++){
			arr[i] = in.next();
		}

		int len = arr[0].length();

		for(int i = 1; i <= len; i++){
			HashSet<String> set = new HashSet<>();

			for(int j = 0; j < n; j++){
				set.add(arr[j].substring(len - i));
			}

			if(set.size() == n){
				System.out.println(i);
				return;
			}

		}

	}
}
