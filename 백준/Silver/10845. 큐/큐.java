import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < n; i++){
			String s = in.next();

			if(s.equals("push")){
				q.add(in.nextInt());
			}else if(s.equals("pop")){
				if(q.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(q.poll());
				}
			}else if(s.equals("size")){
				System.out.println(q.size());
			}else if(s.equals("empty")){
				if(q.isEmpty()){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(s.equals("front")){
				if(q.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(q.peek());
				}
			}else if(s.equals("back")){
				if(q.isEmpty()){
					System.out.println(-1);
				}else {
					System.out.println(((LinkedList<Integer>) q).getLast());
				}
			}

		}
	}
}
