import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ySum = 0;   
		int mSum = 0;   

		for(int i = 0; i < n; i++){
			int t = in.nextInt();

			ySum += (t / 30 + 1) * 10;
			mSum += (t / 60 + 1) * 15;
		}

		if(ySum < mSum){
			System.out.println("Y " + ySum);
		}else if(mSum < ySum){
			System.out.println("M " + mSum);
		}else{
			System.out.println("Y M " + ySum);
		}
	}
}
