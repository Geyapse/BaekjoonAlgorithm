import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<String> set = new HashSet<>();
		int count = 0;

		for(int i = 0; i < n; i++){
			String id = in.next();

			if(id.equals("ENTER")){
				count += set.size();
				set.clear();
			}else{
				set.add(id);
			}
		}
		count += set.size();
		System.out.println(count);
	}
}
