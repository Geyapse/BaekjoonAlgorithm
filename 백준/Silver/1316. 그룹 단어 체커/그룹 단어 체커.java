import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++){
			String word = in.next();
			if(GroupWord(word)){
				count++;
			}
		}
		System.out.println(count);


	}

	public static boolean GroupWord(String word){
		boolean[] visited = new boolean[26];
		char prev = 0;
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);

			if(c != prev){
				if(visited[c - 'a']){
					return false;
				}
				visited[c - 'a'] = true;
				prev = c;
			}
		}
		return true;
	}
}
