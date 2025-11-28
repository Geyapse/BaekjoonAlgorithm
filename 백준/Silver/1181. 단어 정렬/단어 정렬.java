import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.next();
		}
		Arrays.sort(arr, (a, b) -> {
			if (a.length() == b.length()) {
				return a.compareTo(b);
			}
			return a.length() - b.length();
		});
		String prev = "";
		for(String i : arr){
			if(!i.equals(prev)){
				System.out.println(i);
				prev = i;
			}

		}
	}
}
