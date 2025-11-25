import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int count = 0;

		while(n.length() > 1){
			int sum = 0;
			for (int i = 0; i < n.length(); i++) {
				sum += n.charAt(i) - '0';
			}
			count++;
			n = String.valueOf(sum);
		}
		System.out.println(count);
		if(Integer.parseInt(n) % 3 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
