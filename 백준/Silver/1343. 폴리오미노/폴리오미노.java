import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		s = s.replace("XXXX", "AAAA");
		s = s.replace("XX", "BB");
		if(s.contains("X")) {
			System.out.println(-1);
		}else{
			System.out.println(s);
		}
	}
}
