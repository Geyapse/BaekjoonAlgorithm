import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] visited = new boolean[101];
		int count = 0;

		for(int i = 0; i < n; i++){
			int x = in.nextInt();

			if(!visited[x]){
				visited[x] = true;
			}else{
				count++;
			}

		}
		System.out.println(count);
	}
}
