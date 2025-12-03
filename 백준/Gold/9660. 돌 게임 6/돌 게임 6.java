import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		
		if(n%7==0){
			System.out.println("CY");
		}else if(n%7==2){
			System.out.println("CY");
		}else{
			System.out.println("SK");
		}

	}
}
