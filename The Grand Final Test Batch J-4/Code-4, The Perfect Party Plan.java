import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.printf("%.5f\n", maxScore(nums, k));
    }

    private static double maxScore(int[] nums, int k) {
        int n = nums.length;
        double[][] dp = new double[n + 1][k + 1];
        double[] prefixSum = new double[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 1; i <= n; i++) {
            dp[i][1] = prefixSum[i] / i;
        }

        for (int j = 2; j <= k; j++) {
            for (int i = j; i <= n; i++) {
                for (int m = j - 1; m < i; m++) {
                    dp[i][j] = Math.max(dp[i][j], dp[m][j - 1] + (prefixSum[i] - prefixSum[m]) / (i - m));
                }
            }
        }

        return dp[n][k];
    }
}
