import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        for (int i = L; i <= R - 6; i++) {
            if (isPrime(i) && isPrime(i + 6)) {
                System.out.print(i + " " + (i + 6) + " ");
            }
        }
    }
}
