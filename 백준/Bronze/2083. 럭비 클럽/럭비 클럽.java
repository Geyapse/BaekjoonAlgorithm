import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name ="";
		int age = 1;
		int weight = 1;
		String grade ="";
		while(true){
			name = in.next();
			age = in.nextInt();
			weight = in.nextInt();
			if(name.equals("#")&& age == 0 && weight == 0){
				return;
			}
			if(age > 17 || weight >= 80){
				grade = "Senior";
			}else{
				grade = "Junior";
			}
			System.out.println(name+" "+grade);
		}


	}
}
