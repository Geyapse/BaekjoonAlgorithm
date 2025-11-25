import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			if (x == 0 && y == 0 && z == 0){
				break;
			}
			int total = x+y+z;
			int first = Math.max(Math.max(x, y), z);
			if(total - first <= first){
				System.out.println("Invalid");
			}else if(x==y&&y==z){
				System.out.println("Equilateral");
			}else if(x==y||y==z||x==z){
				System.out.println("Isosceles");
			}else{
				System.out.println("Scalene");
			}
		}
	}
}
