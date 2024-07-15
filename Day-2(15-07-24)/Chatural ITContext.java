import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(findNextContest(N));
    }

    public static int findNextContest(int N) {
        for (int i = N; i <= 999; i++) {
            if (allDigitsSame(i)) {
                return i;
            }
        }
        return 999; 
    }

    public static boolean allDigitsSame(int number) {
        String s = Integer.toString(number);
        char firstDigit = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != firstDigit) {
                return false;
            }
        }
        return true;
    }
}
