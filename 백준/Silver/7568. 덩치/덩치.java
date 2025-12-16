import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] people = new int[n][2];

		for(int i = 0; i < n; i++){
			people[i][0] = in.nextInt();
			people[i][1] = in.nextInt();
		}

		for(int i = 0; i < n; i++){
			int rank = 1;
			for(int j = 0; j < n; j++){
				if(people[j][0]>people[i][0] &&
				   people[j][1]>people[i][1]){
					rank++;
				}
			}
			System.out.print(rank + " ");

		}

	}
}
