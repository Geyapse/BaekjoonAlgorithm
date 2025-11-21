import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while (n-- > 0) {
			int k = in.nextInt();
			boolean[] room = new boolean[k+1];

			for(int i = 1; i <= k; i++) {
				for(int j = i; j <= k; j+=i) {
					room[j] = !room[j];
				}
			}

			int count = 0;
			for(int j = 1; j < room.length; j++){
				if(room[j]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
