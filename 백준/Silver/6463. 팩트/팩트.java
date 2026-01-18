import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            long res = 1;

            for (int i = 1; i <= n; i++) {
                res *= i;

                while (res % 10 == 0) {
                    res /= 10;
                }

                res %= 1_000_000;
            }

            System.out.printf("%5d -> %d\n", n, res % 10);
        }
    }
}
