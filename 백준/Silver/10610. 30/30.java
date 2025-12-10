import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		Integer[] arr = new Integer[s.length()];
		String answer = "";

		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			arr[i] = c - '0';
			count += c - '0';
		}


		if(count % 3 != 0){
			System.out.println(-1);
			return;
		}


		Arrays.sort(arr, Collections.reverseOrder());

		if(arr[arr.length-1] != 0){
			System.out.println(-1);
			return;
		}

		for(int i = 0; i < arr.length; i++){
			answer += Integer.toString(arr[i]);
		}


		System.out.println(answer);
	}
}
