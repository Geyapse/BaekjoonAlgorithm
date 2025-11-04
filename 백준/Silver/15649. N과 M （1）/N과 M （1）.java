import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] arr;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[m];
		visit = new boolean[n+1];

		dfs(0);
	}
	public static void dfs(int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= n; i++){
			if(!visit[i]){
				visit[i] = true;
				arr[depth] = i;
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}
}
