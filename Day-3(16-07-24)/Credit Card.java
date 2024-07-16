import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();

        if (X > 77000 || X % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
