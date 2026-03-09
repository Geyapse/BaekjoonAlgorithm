import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i = 0; i < n * n; i++) {
			pq.add(in.nextInt());

			if(pq.size() > n) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());

	}
}
