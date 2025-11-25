import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] arr = new char[n][m];
		int[] acgt = new int[4];
		StringBuilder MAX = new StringBuilder();
		for(int i = 0; i < n; i++){
			String s = in.next();
			for(int j = 0; j < m; j++){
				arr[i][j] = s.charAt(j);
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr[j][i] == 'A'){
					acgt[0]++;
				}else if(arr[j][i] == 'C'){
					acgt[1]++;
				}else if(arr[j][i] == 'G'){
					acgt[2]++;
				}else{
					acgt[3]++;
				}
			}
			int max = acgt[0];
			int maxIndex = 0;
			for(int k = 1; k < 4; k++){
				if(acgt[k] > max){
					max = acgt[k];
					maxIndex = k;
				}
			}
			acgt = new int[4];
			if(maxIndex == 0){
				MAX.append('A');
			}else if(maxIndex == 1){
				MAX.append('C');
			}else if(maxIndex == 2){
				MAX.append('G');
			}else{
				MAX.append('T');
			}
		}
		System.out.println(MAX);
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(arr[i][j]!=MAX.charAt(j)){
					count++;
				}
			}
		}
		System.out.println(count);


	}
}
