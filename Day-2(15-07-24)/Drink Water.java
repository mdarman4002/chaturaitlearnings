import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of people
        int n = scanner.nextInt();

        // Input: Water bottle capacities
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the recommended daily water intake (4 liters in milliliters)
        int dailyWaterIntake = 4000;

        // Calculate the number of refills for each person
        int[] refills = new int[n];
        for (int i = 0; i < n; i++) {
            int remainingWater = dailyWaterIntake - arr[i];
            refills[i] = remainingWater / arr[i];
        }

        // Output: Number of refills for each person
        for (int i = 0; i < n; i++) {
            System.out.print(refills[i] + " ");
        }
        System.out.println(); // Print a newline

        scanner.close();
    }
}
