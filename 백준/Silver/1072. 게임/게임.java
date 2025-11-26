import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 long x = in.nextLong();
		 long y = in.nextLong();

		 long z = (y*100)/x;
		 if(z >= 99){
			 System.out.println(-1);
			 return;
		 }

		 long left = 1;
		 long right = 1000000000;
		 long answer = -1;

		 while(left <= right){
			 long mid = (left + right) / 2;
			 long newRate = ((y + mid) * 100) / (x + mid);

			 if(newRate > z){
				 answer = mid;
				 right = mid - 1;
			 } else{
				 left = mid + 1;
			 }
		 }
		 System.out.println(answer);
	}

}
