import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int num = 0;
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt() % 42;
		}
		Arrays.sort(arr);
		for(int i = 0; i < 9; i++){
			if(arr[i] == arr[i+1]){

			}else{
				num++;
			}
		}
		num++;
		System.out.println(num);
	}
}
