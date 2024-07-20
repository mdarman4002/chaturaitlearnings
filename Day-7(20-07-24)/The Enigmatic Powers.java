import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.println(isPowerOfTwo(n)?"True":"False");
        }
    }

    public static boolean isPowerOfTwo(long n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
