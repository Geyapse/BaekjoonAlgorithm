import java.util.Scanner;

public class Main {
	static int n,k;
	static int[] kit;
	static boolean[] visit;
	static int num;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 k = in.nextInt();
		 kit = new int[n];
		 visit = new boolean[n];
		 num = 0;
		for (int i = 0; i < n; i++) {
			kit[i] = in.nextInt();
		}
		in.close();

		dfs(0,500);
		System.out.println(num);
		}

		static void dfs(int day, int weight){

			if (day == n){
				num++;
				return;
			}

			for (int i = 0; i < n; i++) {
				if (!visit[i]) {
					int next = weight + kit[i] - k;
					if (next >= 500) {
						visit[i] = true;
						dfs(day + 1, next);
						visit[i] = false;
					}
				}
			}
		}
	}

