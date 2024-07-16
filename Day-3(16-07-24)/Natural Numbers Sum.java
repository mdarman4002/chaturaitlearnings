import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        if (N >= 1 && N <= Math.pow(10, 18)) {
            long sum = (N * (N + 1)) / 2;

            System.out.println(sum);
        } else {
            System.out.println("Invalid input. N should be between 1 and 10^18.");
        }
    }
}
