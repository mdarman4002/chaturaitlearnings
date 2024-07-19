import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        char target = scanner.next().charAt(0);

        char result = arr[0];
        boolean found = false;
        for (char c : arr) {
            if (c > target) {
                result = c;
                found = true;
                break;
            }
        }

        if (!found) {
            result = arr[0];
        }

        System.out.println(result);
    }
}
