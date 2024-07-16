import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSum = 0, currentSum = 0;
        for (int i = 0; i < N; i++) {
            currentSum = 0;
            for (int j = i; j < N; j++) {
                currentSum += arr[j];
                if (currentSum > X) {
                    break;
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
