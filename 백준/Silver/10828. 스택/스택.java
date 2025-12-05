import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < n; i++){

			String s = in.next();

			if(s.equals("push")){
				stack.push(in.nextInt());
			} else if(s.equals("top")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			}else if(s.equals("pop")){
				if(stack.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(stack.pop());
				}

			}else if(s.equals("size")){
				System.out.println(stack.size());
			}else if(s.equals("empty")){
				if(stack.isEmpty()){
					System.out.println(1);
				} else{
					System.out.println(0);
				}

			}

		}
	}
}
