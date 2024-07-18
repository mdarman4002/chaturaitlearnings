import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int totalNovels = 0;
        for (int i = 0; i < n; i++) {
            totalNovels += arr[i];
        }

        int totalPens = totalNovels * 4;
        int penBoxes = totalPens / 100;
        if (totalPens % 100 != 0) {
            penBoxes++;
        }

        System.out.println(penBoxes);
    }
}
