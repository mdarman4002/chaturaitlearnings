import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long totalBees = 0;
        for (int i = 0; i < n; i++) {
            int honeyInLitres = scanner.nextInt();
            totalBees += honeyInLitres * 100; // 1 liter = 1000 ml, 1 bee makes 10 ml honey
        }
        System.out.println(totalBees);
    }
}
