import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int totalUnits = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % k == 0) {
                totalUnits += arr[i];
            }
        }

        int totalBill = totalUnits * 10 * 12;

        System.out.println(totalBill);
    }
}
