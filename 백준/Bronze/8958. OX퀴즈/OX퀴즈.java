import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = 0; i < n; i++){
			String s = in.next();
			int score = 0;
			int sum = 0;
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == 'O'){
					score++;
					sum += score;
				}else{
					score = 0;
				}
			}
			System.out.println(sum);
		}

	}
}
