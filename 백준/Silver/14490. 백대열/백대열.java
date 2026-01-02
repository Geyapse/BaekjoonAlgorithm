import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int a = 0, b = 0;
		String c = "";
		String d = "";
		int i = 0;
		while(true){
			if(s.charAt(i) == ':'){
				break;
			}
			c += s.charAt(i);
			i++;
		}
		
		a = Integer.parseInt(c);

		for(int j = i+1; j < s.length(); j++){
			d += s.charAt(j);
		}

		b = Integer.parseInt(d);

		int div = gcd(b, a);

		a = a/div;
		b = b/div;
		System.out.println(a+":"+b);

	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
}
