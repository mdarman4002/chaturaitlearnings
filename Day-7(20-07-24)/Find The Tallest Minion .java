import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int height = calculateHeight(num);
            maxHeight = Math.max(maxHeight, height);
        }
        System.out.println(maxHeight);
    }

    public static int calculateHeight(int num) {
        return num * (num / 2) + (-1 * num);
    }
}
