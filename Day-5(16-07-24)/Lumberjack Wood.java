import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = scanner.nextInt();
        }

        Arrays.sort(trees);

        int low = 0;
        int high = trees[n - 1];
        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (canCut(trees, mid, m)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low);
    }

    public static boolean canCut(int[] trees, int height, int m) {
        int totalCut = 0;
        for (int tree : trees) {
            totalCut += Math.max(0, tree - height);
        }
        return totalCut >= m;
    }
}
