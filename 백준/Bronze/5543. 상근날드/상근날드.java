import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] price = new int[6];
        int k = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 3; j < 5; j++){
                price[k] = arr[i] + arr[j] - 50;
                k++;
            }
        }

        Arrays.sort(price);
        
        System.out.println(price[0]);

    }

}
