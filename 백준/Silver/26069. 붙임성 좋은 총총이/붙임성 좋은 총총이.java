import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		for(int i = 0; i < n; i++){
			String a = in.next();
			String b = in.next();
			if(set.contains(a)||set.contains(b)){
				set.add(a);
				set.add(b);
			}
		}
		System.out.println(set.size());
	}
}
