import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = in.nextLine();
		Integer[] arr = new Integer[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}
