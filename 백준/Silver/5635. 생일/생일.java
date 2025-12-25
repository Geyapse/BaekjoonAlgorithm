import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String youngName = "";
		int youngYear = 0;
		int youngMonth = 0;
		int youngDay = 0;
		String oldName = "";
		int oldYear = 3000;
		int oldMonth = 12;
		int oldDay = 31;

		for(int i = 0; i < n; i++){
			String name = in.next();
			int day = in.nextInt();
			int month = in.nextInt();
			int year = in.nextInt();

			if(year > youngYear ||
				(year == youngYear && month > youngMonth) ||
				(year == youngYear && month == youngMonth && day > youngDay)){
				youngYear = year;
				youngMonth = month;
				youngDay = day;
				youngName = name;
			}

			if(year < oldYear ||
				(year == oldYear && month < oldMonth) ||
				(year == oldYear && month == oldMonth && day < oldDay)){
				oldYear = year;
				oldMonth = month;
				oldDay = day;
				oldName = name;
			}
		}

		System.out.println(youngName);
		System.out.println(oldName);

	}
}
